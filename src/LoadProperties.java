import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class LoadProperties {

		public String load() throws FileNotFoundException , IOException {
			
		        Properties props = new Properties();
				FileInputStream fis = new FileInputStream("src//resources//ApplicationResources.properties");
		
				try
				{
					props.load(fis);
					fis.close();
				}catch(IOException e){
				   throw new IOException("Error loading property file", e);
				}catch (NullPointerException e) {
					throw new NullPointerException("Error loading property file");
				}
				
				String PATH = "";
			
				for(
				Enumeration<?> elms = props.propertyNames();elms.hasMoreElements();)
				{
					String prop = (String) elms.nextElement();
					if (prop.contains("savefilelocation")) {
						PATH = props.getProperty(prop);
					}
				}
				return PATH;
			}
		}