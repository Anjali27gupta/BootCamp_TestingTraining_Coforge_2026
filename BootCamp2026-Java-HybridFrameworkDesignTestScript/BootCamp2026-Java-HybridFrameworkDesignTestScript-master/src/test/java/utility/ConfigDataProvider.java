package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	

		Properties pro;
		public ConfigDataProvider() {
			File src = new File("./Configuration/config.properties");
				try {
					FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
					pro.load(fis);
				} catch (Exception e){
					System.out.println("Exception is... " + e.getMessage());
				}
		}
		
		public String getBrowser() {
			String path = pro.getProperty("Browser");
			return path;
		}
		
		
		public String getAppURL() {
			String Url = pro.getProperty("AppUrl");
			return Url;
		}
	}