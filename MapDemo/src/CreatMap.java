import java.util.*;
public class CreatMap {

	public static void main(String[] args) {
		
		System.out.println("Creating HashMap");
		HashMap<String,Integer> contact=new HashMap<>();
		
		contact.put("User1", 1000000000);
		contact.put("User2", 2000000000);
		contact.put("User3", 1500000000);
		
		System.out.println("Printing Hashpmap Elements");
		
		Set<String> key=contact.keySet();
		Iterator<String> itr=key.iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			System.out.println(k+":"+contact.get(k));
		}
		
		System.out.println();
		System.out.println("Creating LinkedHashMap");
		LinkedHashMap<String,Integer> lcontact=new LinkedHashMap<>();
		
		lcontact.put("User1", 1000000000);
		lcontact.put("User2", 2000000000);
		lcontact.put("User3", 1500000000);
		
		System.out.println("Printing LinkedHashpmap Elements");
		
		Set<String> key1=lcontact.keySet();
		Iterator<String> itr1=key1.iterator();
		while(itr1.hasNext()) {
			String k=itr1.next();
			System.out.println(k+":"+contact.get(k));
		}
		
		System.out.println();
		System.out.println("Creating HashTable");
		Hashtable<String,Integer> hcontact=new Hashtable<>();
		
		hcontact.put("User1", 10000000);
		hcontact.put("User2", 20000000);
		hcontact.put("User3", 15000000);
		
		System.out.println("Printing Hashtable elements");
		
		Set<String> key2=hcontact.keySet();
		Iterator<String> itr2=key2.iterator();
		while(itr2.hasNext()) {
			String k=itr2.next();
			System.out.println(k+":"+contact.get(k));
		}

	}

}
