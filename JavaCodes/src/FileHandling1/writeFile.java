package FileHandling1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
	
	public static void main(String[] args) throws IOException { //write throws IO exception
		
		//File Writer
		FileWriter fw = new FileWriter("E:\\test1.txt");
		fw.write("Hello How are you ?");
		System.out.println("Success -- Text is Written !!");
		fw.close();
		
		
		//File Readr
		
		FileReader fr = new FileReader("E:\\test1.txt");
		int i;
		while ((i=fr.read())!=-1) //!=-1  means till the end of the page 
		{
			System.out.print((char)i);//type cast else it will give ascii value
			
		}
		
		fr.close();
	}
	

}
