package project;


import java.util.Scanner;
public class Maindelete {
public static void main(String[] args) {
System.out.println("welcome ");
	int h=1;
while(h>0)	{
	
System.out.println("enter 1 to list files");
System.out.println("enter 2 to delete,add or search file in existing directory");

System.out.println("enter 3 to close the application");
	
	
	Delete q=new Delete();
	    int n=0;
		try {
		Scanner m=new Scanner(System.in);
System.out.println("enter your option");
		n=m.nextInt();
		}
		catch(Exception e) {

}

switch(n){
 case 1:
  q.ascend();
    break;
    
 case 3:
	 System.out.println("                           ");
	System.out.println("THANKYOU FOR USING THIS APPLICATION");
	System.exit(0);
	
	 
 default:
		System.out.println("invalid option");
		break;
		
 case 2:
	 int gg=0;
	 
    while(gg!=4)
    {
System.out.println("enter 1 to delete file");
System.out.println("enter 2 to add a file");
System.out.println("enter 3 to search file");
System.out.println("enter 4 to navigate to main menu");

	  try {
	  Scanner h1=new Scanner(System.in);
	   gg=h1.nextInt();
	  }
	  catch(Exception g){ 
System.out.println("not a valid option" );
	  }
	 
	  if(gg>0)
	  {	 	 
	switch(gg) {
	 
	   case 1:
System.out.println("enter name of file you want to delete");
		Scanner s= new Scanner(System.in);
		String filename=s.nextLine();
		q.deletefile(filename);
		  break;
		  
	    case 2: 
System.out.println("Enter name of file you want to add");
	Scanner s1= new Scanner(System.in);
		String addfile= s1.nextLine();
		try {
			q.add(addfile);
	       }
		catch (Exception f) {
		System.out.println(f);
		}
	break;
		
	    case 3:
		System.out.println("enter the name of file you want to search ");
		Scanner src= new Scanner(System.in);
		String searchfile= src.nextLine();
		q.search(searchfile);
		break;
	
	    case 4:
	    	break;
		    
		default :
			System.out.println("invalid option");
			break;
	}
	
	}
    }
 }
 }}
}
