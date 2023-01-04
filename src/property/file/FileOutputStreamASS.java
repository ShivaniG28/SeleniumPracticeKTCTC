package property.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileOutputStreamASS {

	public static void main(String[] args) throws Exception {
		
		
		Properties prop = new Properties();
		
		
		prop.setProperty("baseUrl", "https://demoqa.com/");
		prop.setProperty("userName", "Shivani");
		prop.setProperty("passWord", "ktctc");
		File f = new File(System.getProperty("user.dir")+"\\env.properties");
		FileOutputStream fos =new FileOutputStream(f);
		prop.store(fos,"");
		//prop.load(null)
		
		String ss = prop.getProperty("baseUrl");
		System.out.println(ss);
		
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("passWord"));
		//fos.flush();
		
	}

}
