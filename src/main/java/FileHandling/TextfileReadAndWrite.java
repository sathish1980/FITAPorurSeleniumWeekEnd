package FileHandling;

import java.io.*;


public class TextfileReadAndWrite {
	
	String filepath ="C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Input\\Sample.txt";
	String outfilepath ="C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Input\\output.txt";
	
	public void Readdata() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F); // it will read all type os files
		int i;
		while((i=Fs.read())!=-1)
		{
		System.out.print((char)i);
		}	
	}
	
	public void ReaddatawithFileReader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader Fs = new FileReader(F); // it will read only txt file
		int i;
		while((i=Fs.read())!=-1)
		{
		System.out.print((char)i);
		Thread.sleep(1000);
		}	
	}
	
	public void ReaddatawithlinebyLine() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader Fs = new FileReader(F); // it will read only txt file
		BufferedReader Bs = new BufferedReader(Fs);
		String i;
		while((i=Bs.readLine())!=null)
		{
		System.out.println(i);
		Thread.sleep(1000);
		}	
	}
	
	/*
	 * Write data in to file
	 */
	
	public void writedata() throws IOException, InterruptedException
	{
		String name = "Sathish kumar r B.TEch";
		File F = new File(outfilepath); 
		FileOutputStream Fs = new FileOutputStream(F); // it will read only txt file
		Fs.write(name.getBytes());
		Fs.close();
		System.out.println("Done");
	}
	
	public void writedatawithFileWriter() throws IOException, InterruptedException
	{
		String name = "Sathish kumar r B.TEch with writer";
		File F = new File(outfilepath); 
		FileWriter Fs = new FileWriter(F); // it will read only txt file
		Fs.write(name);
		Fs.close();
		System.out.println("Done");
	}
	
	public void ReadandWriter() throws IOException, InterruptedException
	{
		File FI = new File(filepath);
		FileReader FIs = new FileReader(FI); // it will read only txt file
		BufferedReader Bs = new BufferedReader(FIs);
		File FO = new File(outfilepath); 
		FileWriter FW = new FileWriter(FO); // it will read only txt file
		
		String i;
		while((i=Bs.readLine())!=null)
		{
			FW.write(i);
			FW.write(i);
		}	
		FW.close();
		System.out.println("Done");
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		TextfileReadAndWrite T = new TextfileReadAndWrite();
		T.ReadandWriter();
	}

}
