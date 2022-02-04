
public class StringBuf {

	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="xyz";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.contains("ab"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace('a', 'b'));
		
		
		//Using String Builder
		System.out.println();
		System.out.println("Using String Builder");
		StringBuilder sb=new StringBuilder(s2);
		System.out.println(sb);
		System.out.println(s2);
		System.out.println(sb.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(sb.indexOf("xy"));
		System.out.println(sb.isEmpty());
		sb.append(s1);
		System.out.println(sb);
		
		//Using String Buffer
		System.out.println();
		System.out.println("Using String buffer ");
		StringBuffer stb=new StringBuffer();
		stb.append("qwer");
		System.out.println(stb);
		System.out.println(stb.reverse());
		System.out.println(stb.deleteCharAt(0));
		System.out.println(stb);
		
		
		
		
		
		
		
		
		
		

	}

}
