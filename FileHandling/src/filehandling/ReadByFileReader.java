package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadByFileReader 
{
	public static void main(String[] args)
	{
		String path="D:\\eclipse-workspace\\File Handling\\src\\nitin";
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
