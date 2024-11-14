package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author shivagowri
 */
public class FileUtility {
	/**
	 * This method is used to read the data from property file
	 * user must pass key this method return value
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String Key) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata/commondataabhi.properties");
		Properties prop= new Properties();
		prop.load(file);
		return prop.getProperty(Key);
	}

}
