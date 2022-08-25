package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FHDemo2 
{
	public static void main(String[] args)throws IOException
	{
	{
		String path="D:\\eclipse-workspace\\File Handling\\src\\nitin";
		File f1=new File(path);
		try
		{
			f1.createNewFile();
		}
		catch(IOException i)
		{
			System.out.println("alternate way to create file");
		}
		//Writing to file
		
		if(f1.exists()) 
		{
		FileWriter fw=new FileWriter(path);
	    fw.write(Integer.toString(123));
	    fw.close();
	    System.out.println("Write opr successful, check file");
		}
		else
			System.out.println("File is not exists");
		
		long length=f1.length();
		System.out.println("Size of file is:"+length);
		
		//Reading from file
		FileReader rw=new FileReader(path);
	    rw.read();
		rw.close();
		
		/*Scanner sc=new Scanner(path);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		
		
		
		
	}

	
	}
}


