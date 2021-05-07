package gameOdev.core;

import gameOdev.Logger.LoggerManager;

public class LoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		LoggerManager manager = new LoggerManager();
		manager.log(message);
		
	}

}
