package Configuration;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GetConfigProperties {

	public Properties gettingproperties(){
		String projectPath = System.getProperty("user.dir");		
		Properties props = new Properties();
		InputStream input;
		
		try {
			input = new FileInputStream(projectPath+"/src/main/java/Configuration/config.properties");
			props.load(input);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return props;
	}
}


