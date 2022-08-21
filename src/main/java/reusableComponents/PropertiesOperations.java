package reusableComponents;

import java.io.FileInputStream;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperations {
	
	static Properties prop = new Properties();
	
	public static String getPropertyValueByKey(String key) throws Exception {
		//1. load data from properties file
		String propFilePath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis = new FileInputStream(propFilePath);
		prop.load(fis);
		
		//2. read data
		String value = prop.get(key).toString();
		
		if(StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key: "+key + " in properties file.");
		}
		
		return value;
	}

}