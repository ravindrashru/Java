import java.io.*;
import java.util.Scanner;
public class LinkdeList {
	public static void main(String[] args)throws Exception{ 
		Scanner sc=new Scanner(System.in);
		MyLinkedList lis=new MyLinkedList(); 
		System.out.println("How many elements wnated in list");
		int n=sc.nextInt();
		System.out.println("Enter the elemnts");
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			lis.add(temp);
		}
		
	 System.out.println("Printing list elements");
		lis.display();
		
	System.out.println("Enter the key elemts to be searched and dleted");
	int key=sc.nextInt();
	lis.deleteByKey(key);
		 
	
	}

}
class Node{ 
	int data; 
	Node address; 
 
} 
class MyLinkedList{ 
	private Node head=null; 
	private Node tail=null; 
	int size=0; 
	public void add(int data) { 
	Node n1=new Node(); 
	n1.data=data; 
	n1.address=null; 
	size++; 
	 
	if(head==null) { 
	head=n1; 
	tail=n1; 
	} 
	else { 
	tail.address=n1; 
	tail=n1; 
	} 
	} 
	public void display() { 
	Node temp=head; 
	while(temp!=null) { 
	System.out.println(temp.data); 
	temp=temp.address; 
	} 
	System.out.println();
} 
 
public boolean isEmpty() { 
	return head==null; 
} 
public void deleteByKey(int key) {
	Node currNode=head,prev=head.address;
	if(currNode!=null && currNode.data==key) {
		head=currNode.address;
		System.out.println(key+"Key found and deleted");
		
	}
	while(currNode!=null && currNode.data!=key) {
		prev=currNode;
		currNode=currNode.address;
		
	}
	if(currNode!=null) {
		prev.address=currNode.address;
		System.out.println(key+" found and deleted");
	}
	if(currNode==null) {
		System.out.println(key+" key not found in list");
	}
}
	
}

