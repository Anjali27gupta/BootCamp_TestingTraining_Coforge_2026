package obj.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
	
	Properties pro;
	
	public ConfigFileReader(){
		try {
			File src = new File("./PropertiesFile/config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e){
			System.out.println("Exception is... " + e.getMessage());
		}
	}
	
//	public String getChromePath() {
//		String path = pro.getProperty("ChromeDriver");
//		return path;
//	}
	
	public String getEdgePath() {
		String path = pro.getProperty("EdgeDriver");
		return path;
	}
	
	
	public String getAppURL() {
		String Url = pro.getProperty("baseURL");
		return Url;
	}
	
	public String UName() {
		String uname = pro.getProperty("Uname");
		return uname;
	}
	
	public String PWord() {
		String pswd = pro.getProperty("psd");
		return pswd;
	}
	
	public String SignButton() {
		String button = pro.getProperty("SignIn");
		return button;
	}
}
