import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileManagement {

	public static void saveFileOnTxt(byte[] bytes, String logfilename) throws FileNotFoundException, IOException{

		LoadProperties load = new LoadProperties();
		
		String PATH = load.load();
		
    	byte[] value = bytes;
		
		String fileName = logfilename + ".txt"; 

		File filefile = new File(PATH, fileName);
	
		File directory = new File(String.valueOf(PATH));
	
		if (!directory.exists()) {
			directory.mkdir();
			if (!filefile.exists()) {
				filefile.getParentFile().mkdir();
				filefile.createNewFile();
			}
		}
		
        OutputStream os = new FileOutputStream(filefile);
		os.write(value);
		os.close();
		}
}
