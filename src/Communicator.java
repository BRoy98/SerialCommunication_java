//package TigerControlPanel;

import gnu.io.*;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.TooManyListenersException;

public class Communicator implements SerialPortEventListener
{
    mainForm window = null;

    private Enumeration ports = null;
    private HashMap portMap = new HashMap();
    private CommPortIdentifier selectedPortIdentifier = null;
    private SerialPort serialPort = null;
    private InputStream input = null;
    private OutputStream output = null;
    final static int TIMEOUT = 2000;
    final static int SPACE_ASCII = 32;
    final static int DASH_ASCII = 45;
    final static int NEW_LINE_ASCII = 10;
    private boolean bConnected = false;
    String logText = "";

    public Communicator(mainForm window)
    {
        this.window = window;
    }

    public void refreshPort()
    {
        window.comCombo.removeAllItems();
        ports = CommPortIdentifier.getPortIdentifiers();

        while (ports.hasMoreElements())
        {
            CommPortIdentifier curPort = (CommPortIdentifier)ports.nextElement();

            //get only serial ports
            if (curPort.getPortType() == CommPortIdentifier.PORT_SERIAL)
            {
                window.comCombo.addItem(curPort.getName());
                portMap.put(curPort.getName(), curPort);
            }
        }
        logText = "Available ports scaned successfully.";
        window.txtbStat.setText(logText);
        
    }

    public void connect()
    {
        String selectedPort = (String)window.comCombo.getSelectedItem();
        selectedPortIdentifier = (CommPortIdentifier)portMap.get(selectedPort);
        
        CommPort commPort = null;

        try
        {
            int baudRate = Integer.parseInt(window.baudCombo.getSelectedItem().toString());
            //the method below returns an object of type CommPort
            commPort = (SerialPort)selectedPortIdentifier.open("TigerControlPanel", TIMEOUT);
            serialPort = (SerialPort)commPort;
            /*serialPort.setSerialPortParams(
                    9600,
                    serialPort.DATABITS_8,
                    serialPort.STOPBITS_1,
                    serialPort.PARITY_NONE);*/
            bConnected = true;
            window.btnSend.setEnabled(true);
            window.txtbSend.setEnabled(true);
            window.txtbRecive.setEnabled(true);
            window.btnDisconnect.setEnabled(true);
            window.autoScroll.setEnabled(true);
            window.btnConnect.setEnabled(false);
            window.btnRefresh.setEnabled(false);
            window.btnClear.setEnabled(true);
            window.comCombo.setEnabled(false);
            window.baudCombo.setEnabled(false);
            logText = selectedPort + " opened successfully.";
            window.txtbStat.setText(logText);
        }
        catch (PortInUseException e)
        {
            logText = selectedPort + " is in use. (" + e.toString() + ")";
            window.txtbStat.setText(logText);
        }
        catch (Exception e)
        {
            logText = "Failed to open " + selectedPort + "(" + e.toString() + ")";
            window.txtbStat.setText(logText);
        }
    }
    
    public void disconnect()
    {
        //close the serial port
        try
        {
            serialPort.removeEventListener();
            serialPort.close();
            input.close();
            output.close();
            bConnected = false;
            window.btnSend.setEnabled(false);
            window.txtbSend.setEnabled(false);
            window.txtbRecive.setEnabled(false);
            window.btnDisconnect.setEnabled(false);
            window.autoScroll.setEnabled(false);
            window.btnConnect.setEnabled(true);
            window.btnRefresh.setEnabled(true);
            window.btnClear.setEnabled(false);
            window.comCombo.setEnabled(true);
            window.baudCombo.setEnabled(true);
            logText = "Disconnected.";
            window.txtbStat.setText(logText);
        }
        catch (Exception e)
        {
            logText = "Failed to close port." + "(" + e.toString() + ")";
            window.txtbStat.setText(logText);
        }
    }
    
    public boolean initIOStream()
    {
        //return value for whather opening the streams is successful or not
        boolean successful = false;

        try {
            //
            input = serialPort.getInputStream();
            output = serialPort.getOutputStream();
            
            successful = true;
            return successful;
        }
        catch (IOException e) {
            logText = "I/O Streams failed to open. (" + e.toString() + ")";
            window.txtbStat.setText(logText); 
            return successful;
        }
    }
    
    final public boolean getConnected()
    {
        return bConnected;
    }

    public void initListener()
    {
        try
        {
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
        }
        catch (TooManyListenersException e)
        {
            logText = "Too many listeners. (" + e.toString() + ")";
            window.txtbStat.setText(logText); 
        }
    }

    public void serialEvent(SerialPortEvent evt) {
        if (evt.getEventType() == SerialPortEvent.DATA_AVAILABLE)
        {
            try
            {
                byte singleData = (byte)input.read();
                
                if (singleData != NEW_LINE_ASCII)
                {
                    String inData = new String(new byte[] {singleData});
                    window.txtbRecive.append(inData);
                }
                else
                {
                    window.txtbRecive.append("\n");
                }
            }
            catch (Exception e)
            {
                logText = "Failed to read data. (" + e.toString() + ")";
                window.txtbStat.setText(logText); 
            }
        }
    }

    public void writeData(String dataSend)
    {
        if(!dataSend.isEmpty())
        {
            try
            {
                byte[] outData = dataSend.getBytes();
                output.write(outData);
                window.txtbSend.setText(null);
                //output.flush();
                logText = "Data writen to "+ serialPort.getName();
                window.txtbStat.setText(logText); 
            }
            catch (Exception e)
            {
                logText = "Failed to write data. (" + e.toString() + ")";
                window.txtbStat.setText(logText); 
            }
        }
    }
}
