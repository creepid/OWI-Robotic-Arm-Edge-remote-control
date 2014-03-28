package com.remote.arm.serial;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

import javax.comm.CommPortIdentifier;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;
import javax.comm.UnsupportedCommOperationException;

import com.remote.arm.command.CommandFactory;

public class SerialComm implements ISerialCommSettings, Runnable, SerialPortEventListener {
	
	private volatile static String COM_PORT_NUM;
	private volatile static int COM_BOUD_RATE;

	private Thread readThread;
	private String portIdName;
	private int readByte;
	 
	 private OutputStream outputStream; 
	 private InputStream inputStream;
	 
	 private CommPortIdentifier portId;
	 private Enumeration portList;
	 private SerialPort serialPort;

	
	public synchronized void getCommunication(String command, String sensit) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		portList = CommPortIdentifier.getPortIdentifiers();
		int commToSend=CommandFactory.getCommand(command, sensit);
		if (commToSend!=-1){
		 while (portList.hasMoreElements()) {
		 portId = (CommPortIdentifier) portList.nextElement();
			if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
				if (portId.getName().equals(COM_PORT_NUM)) {
					portIdName=portId.getName();
					 try {
						 serialPort = (SerialPort)portId.open(APP_WRITE_NAME, COM_TIMEOUT);
					  } catch (PortInUseException e) {}
				
					  try {
						  outputStream = serialPort.getOutputStream();
					  } catch (IOException e) {}
					  try {
						  serialPort.setSerialPortParams(COM_BOUD_RATE,
						  SerialPort.DATABITS_8,
						  SerialPort.STOPBITS_1,
						  SerialPort.PARITY_NONE);
					  } catch (UnsupportedCommOperationException e) {}
				
					   try {
						  if (commToSend!=-1)
							  outputStream.write(commToSend);
	                                         System.out.println(commToSend);
					  } catch (IOException e) {}
				
			   }
			}
		 }
	   }
	}
	
	public void serialEvent(SerialPortEvent event) {
		 switch(event.getEventType()) {
			 case SerialPortEvent.BI:break;
			 case SerialPortEvent.OE:break;
			 case SerialPortEvent.FE:break;
			 case SerialPortEvent.PE:break;
			 case SerialPortEvent.CD:break;
			 case SerialPortEvent.CTS:break;
			 case SerialPortEvent.DSR:break;
			 case SerialPortEvent.RI:break;
			 case SerialPortEvent.OUTPUT_BUFFER_EMPTY:break;
			 case SerialPortEvent.DATA_AVAILABLE:
				 try {
					 while (inputStream.available()>0){   
						  readByte = inputStream.read(); 
						  System.out.println(readByte);
	                  }                                 
				} catch (IOException e) {
							e.printStackTrace();
				 }break;
		 }
	}


	
	public SerialComm(String command, String sensit) {

		 try {
			 
			 getCommunication(command, sensit);
			 
			 } catch (ClassNotFoundException e1) {
			 // TODO Auto-generated catch block
			 e1.printStackTrace();
			 } catch (InstantiationException e1) {
			 // TODO Auto-generated catch block
			 e1.printStackTrace();
			 } catch (IllegalAccessException e1) {
			 // TODO Auto-generated catch block
			 e1.printStackTrace();
		 }
		 
			 readThread = new Thread(this);
			 readThread.start();
		 }
	
	
	public void run() {
		try{
			 Thread.sleep(COM_CONNECTION_TIME);
			} catch (Exception e) {
					e.printStackTrace();}
		
		finally{
			synchronized (serialPort){
				if (serialPort!=null)
						serialPort.close();
			}
			
		}
	 }

	public static String getCOM_PORT_NUM() {
		return COM_PORT_NUM;
	}

	public static void setCOM_PORT_NUM(String cOM_PORT_NUM) {
		COM_PORT_NUM = cOM_PORT_NUM;
	}

	public static int getCOM_BOUD_RATE() {
		return COM_BOUD_RATE;
	}

	public static void setCOM_BOUD_RATE(int cOM_BOUD_RATE) {
		COM_BOUD_RATE = cOM_BOUD_RATE;
	}
	
	


}
