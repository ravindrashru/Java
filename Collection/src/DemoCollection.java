import java.util.*;
import java.io.*;
public class DemoCollection {

	public static void main(String[] args) {
		
		System.out.println("creating the array list");
		
		ArrayList<Integer> alist=new ArrayList();
		alist.add(30);
		alist.add(20);
		alist.add(10);
		alist.add(30);
		
		System.out.println("Printing array list elements");
		
		Iterator itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		System.out.println();
		
		System.out.println("Creating Vector");
		
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(30);
		vec.add(20);
		vec.add(10);
		vec.add(30);
		
		//System.out.println(vec);
		
		System.out.println("Printing Vector Elements");
		
		Iterator<Integer> ve=vec.iterator();
		while(ve.hasNext()) {
			System.out.println(ve.next());
		}
		
		System.out.println();
		
		System.out.println("Creating Linked List");
		LinkedList<Integer> llist=new LinkedList<Integer>();
		llist.add(30);
		llist.add(20);
		llist.add(10);
		llist.add(30);
		
		System.out.println("Printing lined list elements");
		
		Iterator<Integer> lis=llist.iterator();
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		
		System.out.println();
		
		System.out.println("Creating hashset");
		
		HashSet<Integer> has=new HashSet<Integer>();
		has.add(30);
		has.add(20);
		has.add(10);
		has.add(30);
		
		System.out.println("Printing hashset elements");
		
		Iterator<Integer> ha=has.iterator();
		while(ha.hasNext()) {
			System.out.println(ha.next());
		}
		
		System.out.println();
		
		System.out.println("Creating Linked hashset");
		
		LinkedHashSet<Integer> lhas=new LinkedHashSet<Integer>();
		lhas.add(30);
		lhas.add(20);
		lhas.add(10);
		lhas.add(30);
		
		System.out.println("Printing Linked hashset elements");
		
		Iterator<Integer> lha=lhas.iterator();
		while(lha.hasNext()) {
			System.out.println(lha.next());
		}
		
		

	}

}
