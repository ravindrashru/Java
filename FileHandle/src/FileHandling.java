import java.util.*;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		//Creating file and also writing into the file
		FileWriter fw=new FileWriter("one.txt",true);
		fw.write("Welcome to the file project");
		fw.append("Its second line which is adding into the file ");
		
		fw.close();
		
		//Reading the file and print its content
		FileReader fr=new FileReader("one.txt");
		int i;    
        while((i=fr.read())!=-1) {    
          System.out.print((char)i);
        }
          fr.close();    
        System.out.println();
         
        //Deleting the file
        File file=new File("one.txt");
        if(file.delete()) {
        	System.out.println("File deleted successful");
        	
        }
        else {
        	System.out.println("File not deleted");
        }
	}

}
