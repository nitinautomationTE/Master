package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadByBufferReader 
{
	public static void main(String[] args)
	{
		String path="D:\\eclipse-workspace\\File Handling\\src\\nitin";
		 BufferedReader br=null;
		try
		{
			File f1=new File(path);
		     br=new BufferedReader(new FileReader(f1));
			
		    /*int c=0;
			while((c=br.read()) !=-1)
			{
				System.out.print((char) c);
			}*/
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

}
