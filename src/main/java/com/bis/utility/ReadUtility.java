package com.bis.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.bis.constants.FrameworkContants;

public class ReadUtility {

	private ReadUtility()
	{

	}
	private static Properties property=new Properties();
	private static final Map<String,String> CONFIGMAP=new HashMap<>();
//System.getProperty("user.dir")+
	static {
		try
		{
			FileInputStream file=new FileInputStream(FrameworkContants.getConfigfilepath());
			property.load(file);
			for(Map.Entry<Object,Object> entry:property.entrySet())
			{
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(property.get(entry.getValue())));
			}
	//	property.entrySet().forEach(entry ->CONFIGMAP,put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}


	public static String get(String key) throws Exception
	{
		if(Objects.isNull(key)|| Objects.isNull(CONFIGMAP.get(key)))
		{
			throw new Exception("property name "+ key+" is not found please check");
		}
		return CONFIGMAP.get(key);
	}


	public static String getValue(String key) throws Exception
	{


		if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key))
		{
			throw new Exception("property name "+ key+" is not found please check");
		}
		return property.getProperty(key);
	}
}
