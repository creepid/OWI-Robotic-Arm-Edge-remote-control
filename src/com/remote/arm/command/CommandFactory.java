package com.remote.arm.command;

public class CommandFactory {
	
	public static int getCommand(String Type, String Sensit){
		int commandResult;
		CommandType commandType=CommandType.valueOf(Type.toUpperCase());	
		SensitType sensitType=SensitType.valueOf(Sensit.toUpperCase());
				switch(commandType){
					case MOTOR1_UP: commandResult=0xA1;break;
					case MOTOR1_DOWN: commandResult=0xA4;break;
					
					case MOTOR2_UP: commandResult=0xB1;break;
					case MOTOR2_DOWN: commandResult=0xB4;break;
					
					case MOTOR3_UP: commandResult=0xC1;break;
					case MOTOR3_DOWN: commandResult=0xC4;break;
					
					case MOTOR4_UP: commandResult=0xD1;break;
					case MOTOR4_DOWN: commandResult=0xD4;break;
					
					case MOTOR5_UP: commandResult=0xE1;break;
					case MOTOR5_DOWN: commandResult=0xE4;break;
					
					default: return (-1);
				}
				
					switch(sensitType){
						case LOW: break;
						case MEDIUM: commandResult+=0x01;break;
						case HIGH: commandResult+=0x02;break;
						
						default: return (-1);
					}
			return commandResult;
				
		}


}
