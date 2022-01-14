import java.io.IOException;

public class FileManagementTest {

	public static void main(String[] args) throws IOException {
		
		//byte[] cancelBytearray = {"teste","teste2"};
		
        String string = "GeeksForGeeks"
                + " - A Computer Science"
                + " Portal for geeks"
                + " new line!!!" ;

				byte[] bytes = string.getBytes();

		String logfilename = "FLAVIO_TESTE";
		
		FileManagement.saveFileOnTxt(bytes, logfilename);
	}

}
