package com.bis.constants;

public class FrameworkContants {
	
	private FrameworkContants()
	{
		
	}
	
private static final String CHROMEDRIVERPATH=System.getProperty("webdriver.chrome.driver","/src/test/resources/Executable/chromedriver.exe");
private static final String CONFIGFILEPATH=System.getProperty("webdriver.chrome.driver","G:\\Automation-workspace\\SeleniumAutomationFramework\\src\\test\\resources\\configFile\\ConfigFile.properties");



public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}



public static String getConfigfilepath() {
	return CONFIGFILEPATH;
}
}
