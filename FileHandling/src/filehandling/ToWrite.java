package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToWrite 
{
	public static void main(String[] args)
	
	{
		String path="D:\\eclipse-workspace\\File Handling\\src\\28-april";
		File f1=new File(path);
		//Creating a new file
	    try 
	    {
			boolean flag=f1.createNewFile();
			if(flag)
				System.out.println("File is created");
			else
				System.out.println("File is already present");
		}
	    catch (IOException e) 
	    {
			
			e.printStackTrace();
		}
	    //Writing into file
	   if(f1.exists()) 
	   {
		   FileWriter fw=null;
	     try 
	     {
	    	 fw=new FileWriter(f1);
	    	 if(f1.canWrite())
	    	 {
	    		 fw.write("Shiva");
	    		 fw.write("hellonn");
	    		 fw.write('N');
	    		 fw.write("45");
	    		// fw.write("helloagain", 4, 3);
	    		// fw.
	    		 System.out.println("Written successfully");
	    		
	         }
	    	 else
	    		 System.out.println("Unable to write into file");
	     }
	     catch(IOException e)
	     {
	    	e.printStackTrace();
	     }
	     finally
	     {
	    	 try 
	    	 {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	     }
	   }
	   else
		   System.out.println("File not exists.");
	  
	  
		
	}

}
