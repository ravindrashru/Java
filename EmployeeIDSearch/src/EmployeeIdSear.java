import java.util.*;
import java.util.regex.*;
public class EmployeeIdSear {

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an string array");
		n=sc.nextInt();
		String[] arr= new String[n];
		boolean flag=false;	
		String ptr="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-z]+.[a-z]+$";
		
		System.out.println("Please enter the Employees EmailId of Company:");
		label1:for(int i=0;i<n;i++) {
			String temp=sc.next();
			Pattern p=Pattern.compile(ptr);
			Matcher match=p.matcher(temp);
			if(match.matches()) {
			arr[i]=temp;
			}
			else {
				System.out.println("Enter valid email id");
				i-=1;
				continue label1;
			}
		}
		System.out.println("Please enter the Employee EmailId need to be searched:");
		String eml=sc.next();
		for(int i=0;i< arr.length;i++) {
			if(arr[i].equalsIgnoreCase(eml)) {
				flag=true;
				break;
				
			}
			
		}
		if(flag) {
			System.out.println("Entered EmailId is avilable in Employees EmailId list");
			
		}
		else {
		
		System.out.println("Entered EmailId is Not found");}
		
		
		sc.close();
	}

}
