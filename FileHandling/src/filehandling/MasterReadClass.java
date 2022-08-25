package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class MasterReadClass
{
	String path="D:\\eclipse-workspace\\File Handling\\src\\nitin";
	void readByFileInputStream()
	{
		FileInputStream fip=null;
	    try 
	    {
	    	File f1=new File(path);
	    	fip=new FileInputStream(f1);
	    	System.out.println("File content is:");
	    	int c=0;
	    	while((c=fip.read())!=-1)
	    	{
	    		System.out.print((char)c);
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
	void readByBufferReader()
	{
		 BufferedReader br=null;
		try
		{
			File f1=new File(path);
		    br=new BufferedReader(new FileReader(f1));
			
			 for(int c=0;(c=br.read())!=-1;c++) 
			 {
				 System.out.print((char) c);
			 }
		    
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				br.close();
			} catch (IOException e)
			{
				
				e.printStackTrace();
			}
		}
	}
	void readByFileReader()
	{
		File f1=new File(path);
		FileReader fr=null;
		try 
		{
			     fr=new FileReader(f1);
		    	for(int i=0;(i=fr.read())!=-1;i++)
		    	{
		    		System.out.print((char)i);
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
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		
}


