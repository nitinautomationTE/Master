package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FHMethod 
{
	static String path="D:\\eclipse-workspace\\File Handling\\src\\29-april";
	File f1 =new File(path);
	public static void main(String[] args)
	{
		FHMethod c1=new FHMethod();
		while(true)
	{
		System.out.println("To create file,press 1");
		System.out.println("To write a file,press 2");
		System.out.println("To read file,press 3");
		System.out.println("To delete file,press 4");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: c1.createFile();
		        break;
		case 2: c1.writeFile();
		        break;
		case 3: c1.readFile();
		        break;
		case 4:c1. deleteFile();
		        break;
		default:System.out.println("Invalid choice"); 
		//copyFile();

		}
	}
	}
	public  void createFile()
	{
		try
		{
			
			boolean b1=f1.createNewFile();
			if(b1)
				System.out.println("file created");
			else
				System.out.println("file alrealdy exists");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	public  void writeFile()
	{
	 if(f1.canWrite())
	 {
		try
		{
		   FileWriter wr=new FileWriter(path);
		   wr.write("Hello world");
		   wr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
	 else
	    System.out.println("File is not writable");
	}
	public static void readFile()
	{
		FileReader fr=null;
		try
		{
		   fr=new FileReader(path);
		   System.out.println("Reading data from file.......");
		  int i=0;
		  while((i=fr.read())!=-1)
		  {
			  System.out.print((char)i);
		  }
		  System.out.println("\n");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public  void deleteFile()
	{
		if(f1.exists())
		{
			f1.delete();
			System.out.println("file deleted successful");
		}
		else
			System.out.println("Sorry! can't delete.File is not exists");
	}
	

}
