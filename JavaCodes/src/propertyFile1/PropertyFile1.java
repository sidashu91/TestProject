package propertyFile1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;



public class PropertyFile1 {
	
	public static void main(String[] args) throws IOException {
		
		//E:\Java Workspace\JavaProject1\src\propertyFile1
		
		FileWriter fw = new FileWriter("E:\\Java Workspace\\JavaProject1\\src\\propertyFile1\\test1.properties");
		Properties p = new Properties();
		p.setProperty("url", "www.google.com");
		p.setProperty("user", "abc");
		p.store(fw, "My First Propert File");
		System.out.println("Success");
		fw.close();
		
		
	//Reading:
		FileReader fr = new FileReader("E:\\Java Workspace\\JavaProject1\\src\\propertyFile1\\test1.properties");
		p.load(fr);
		System.out.println(p.getProperty("url"));

		
	}

}
