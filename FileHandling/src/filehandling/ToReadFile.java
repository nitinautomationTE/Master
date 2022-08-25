package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ToReadFile 
{
	public static void main(String[] args)
	{
		String path="D:\\eclipse-workspace\\File Handling\\src\\nitin";
	    FileInputStream fip=null;
	    try 
	    {
	    	File f1=new File(path);
	    	fip=new FileInputStream(f1);
	    	System.out.println("File content is:");
	    	int c=0;
	    	while((c=fip.read()) !=-1)
	    	{
	    		
	    	}
	     }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    finally
	    {
	    	try
	    	{
	    		fip.close();
	    	}
	    	catch(IOException e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    
	
	}
	

}
