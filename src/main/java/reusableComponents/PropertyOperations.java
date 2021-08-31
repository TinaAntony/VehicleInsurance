package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertyOperations {
	
	static Properties getpropertyFile = new Properties();
	
	public static String getPropertyValuebyKey(String key) throws Exception
	{
		String propertyFilePath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream testdata = new FileInputStream(propertyFilePath);
		getpropertyFile.load(testdata);
		String value = getpropertyFile.get(key).toString();
		if (StringUtils.isEmpty(value))
		{
			throw new Exception ("Value is not specified for key "+ key +" in propery file.");
		}
		return value;
			
		
	}

}
