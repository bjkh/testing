package com.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerTest {

	
	static String configFilename = "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/log4j.properties";
	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
	@BeforeClass
	public static void getlogger(){
		
		PropertyConfigurator.configure(configFilename);
	}
	@Test
	public void testLogger(){
		getlogger();              //log4j.properties filema log4j.appender.FILE.Append=true gare ra LoggerTest.java filema getlogger();hatayo vane sabailog ekchoti matrai print hun6 consolema agadiko log haru dekhidainan 
		logger.info("log test1");
		logger.info("log test2");
		logger.info("log test3");
		logger.info("log test4");

		logger.info("log testA");
		logger.info("log testB");
		logger.info("log testC");
		logger.info("log testD");

		
		
	}
	
}
