package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesconcept {
	
	String filepath ="C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Input\\Env.properties";
	
	public void PropertyfileRead() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F); // it will read all type os files
		Properties P = new Properties();
		P.load(Fs);
		System.out.println(P.getProperty("url"));
		System.out.println(P.getProperty("name"));
		System.out.println(P.getProperty("age"));
		System.out.println(P.getProperty("address"));
		P.setProperty("address", "Fita ,porur");
		System.out.println(P.getProperty("address"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertiesconcept P = new Propertiesconcept();
		P.PropertyfileRead();
	}

}
