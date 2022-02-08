import java.io.*;
public class FIleReadWrite {

	public static void main(String[] args) throws IOException {
		
		//Creating file using FileWriter
		
		FileWriter flw=new FileWriter("NewFile.txt",true);
		flw.write("Its firts line of the file.");
		flw.append("Its Second line of the file.");//appending files contents
		flw.append("Its third of the file.");
		flw.close();
		
		//Reading content for the NewFile.txt
		
		FileReader flr=new FileReader("NewFile.txt");
		System.out.println("Reading file contents");
		int i;    
        while((i=flr.read())!=-1) {    
          System.out.print((char)i);
        }
          flr.close();    
        System.out.println();
        
        File f=new File("NewFile.txt");
        if(f.delete()) {
        	System.out.println("File Successfully deleted");
        }
        else {
        	System.out.println("File not deleted");
        }
        
        
		
		
		
		
		
		

	}

}
