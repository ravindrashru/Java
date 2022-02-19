package FinalAssisdte;
import java.io.*;
import java.util.*;
import java.lang.*;

class PhaseFinalAss {
	public static void main(String[] args) throws Exception {
		System.out.println("\twelcome to LockedMe.com");
		System.out.println("\tDeveloped by Company Lockers Pvt. Ltd.");
		PhaseFinalAss.UserInterface();
	}

	public static void UserInterface() {
		String[] arr= {"1.current file names in ascending order",
						"2.Add File/Delete File/serach file/main menu",
						"3.close the application"};
		//ArrayList<String> alist=new ArrayList<String>();
		//LinkedList<String> llist=new LinkedList<String>();
		File fd=new File("D:\\Reference");
		File[] f=fd.listFiles();
		
		
		Arrays.sort(f);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Scanner sc= new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			if(choice==1 && f.length==0) {		
			System.out.println("No files or folder ins the directory");
			PhaseFinalAss.UserInterface();
			}			
			else if(choice==1 && f.length>=1) {
			String[] arr1=fd.list();
			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr1));
			}
			PhaseFinalAss.UserInterface();
			break;
		

		case 2:
			char cha='\0';	
			
			while(cha!='d') {
				System.out.println("please enter your choice a,b,c or d for add,delete,serach or main menu");
				cha=sc.next().charAt(0);
			switch(cha) {
			
				case 'a':
				System.out.println("Enter the file/folder name to be added");
				String fname=sc1.next();
				File fd1=new File("D:\\Reference\\",fname);
				try {
					if(fd1.createNewFile()) {
						System.out.println(fname+" file successfuly created");
						
						
					}
					else {
						System.out.println(fname+"file creation error");
						
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
				
				
			case 'b':
				System.out.println("Enter the file/folder name to be deleted");
				String fname2=sc1.next();
				File fd2=new File("D:\\Reference\\",fname2);
				try {
				if(fd2.delete()) {
					System.out.println(fd2.getName() + " deleted"); 
				}
				else {
					System.out.println("File Not Found"); 
					
					}
				}
				catch(Exception e) {
					e.printStackTrace();  
				}
				break;
			
			case 'c':
				System.out.println("Enter the file/folder name to be searched");
				String fname3=sc1.next();
				File fd3=new File("D:\\Reference");
				boolean flag=false;
				String[] fi=fd3.list();
				try {
					if(fi==null) {
						System.out.println("Direcoty is empty");
						
					}
					else {
						for (int i = 0; i < fi.length; i++) {
			                if(fname3.equalsIgnoreCase(fi[i])) {
			                	flag=true;
			                }
			                
					}
						if(flag) {
							System.out.println("successful operation");
							}
						else {
							System.out.println("unsuccessful operation");
						}
						}
				}
				catch(Exception e) {
					e.getStackTrace();
				}
				break;
				
			case 'd':
				PhaseFinalAss.UserInterface();
				break;
									
			default:
				System.out.println("Please enter the correct choice");
				}
		 }
			
		case 3:
			System.out.println("Closing the application");
			break;
		default:
			System.out.println("Enter the valid choice");
			PhaseFinalAss.UserInterface();
					
			
			}
		
		
	}
	
	
}

