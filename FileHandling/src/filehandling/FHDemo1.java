package filehandling;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.JobHoldUntil;

public class FHDemo1 
{
	public static void main(String[] args) throws IOException
	{
		File obj=new File("D:\\eclipse-workspace\\File Handling\\src\\27-april");
		obj.createNewFile();
		// getting file name
		String file_name=obj.getName();
		System.out.println("Name of file:"+file_name);
		// getting file length
		System.out.println("Size of file:"+obj.length());
		//getting file length
	    String	path1=obj.getPath();
	    System.out.println("\nSimple path:"+path1);
	    //getting path by getAbsolutePath()
		String path=obj.getAbsolutePath();
		System.out.println(path);
		//getting path by getAbsoluteFile()
		File af=obj.getAbsoluteFile();
		System.out.println("\n"+af);
		//getting path by getCanonicalFile()
		File f=obj.getCanonicalFile();
		System.out.println("\n"+f);
		//getting path by getCanonicalPath()
		String f1=obj.getCanonicalPath();
		System.out.println("\n"+f1);
		
		//Object c=obj.getClass(); it is also working
		Class<? extends File> c=obj.getClass();
		System.out.println("\n"+c);
	    
		//Getting free space
		System.out.println("Free spaces"+obj.getFreeSpace());
		//Getting total space
		System.out.println("\nTotal spaces:"+obj.getTotalSpace());
		//Getting total space
		long us=obj.getUsableSpace();
		System.out.println("\nUsable spaces:"+us);
	   
		//Can execute file or not
         boolean ce= obj.canExecute();
	     System.out.println(ce);
	   
       //Can read file or not
	    boolean cr= obj.canRead();
	    System.out.println(cr);
	   
	  //Can read file or not
	    boolean cw=obj.canWrite();
	    System.out.println(cw);
	 
	    //file exists or not 
	   boolean ex= obj.exists();
	   System.out.println(ex);
	   
	
	}

}
