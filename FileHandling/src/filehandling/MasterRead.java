package filehandling;

import java.util.Scanner;

public class MasterRead 
{
	public static void main(String[] args)
	{
		 MasterReadClass ms1=new MasterReadClass();
		 
		 while(true)
	  {
		System.out.println("\nPress 1 for read by FileInputStream");
		System.out.println("Press 2 for read by BufferReader");
		System.out.println("Press 3 for read by FileReader");
	    System.out.println("Enter your choice");
	    Scanner sc=new Scanner(System.in);
	    int choice=sc.nextInt();
	    
	    switch(choice)
	    {
	    case 1:ms1.readByFileInputStream();
	           break;
	    
	    case 2:ms1.readByBufferReader();
	           break;
		
	    case 3:ms1.readByFileReader();
	           break;
	    }
	  }
	}

}
