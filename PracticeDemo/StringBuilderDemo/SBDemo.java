package StringBuilderDemo;

public class SBDemo 
{
	
	public static void main(String[] args) {
	
//		String s ="a";
//		System.out.println(System.identityHashCode(s));
//		
//		String s2 ="a";
//		System.out.println(System.identityHashCode(s2));
//		
//		String s3 = "b";
//		System.out.println(System.identityHashCode(s3));
//		
//		s = s3;
//		System.out.println(System.identityHashCode(s));
//		
		
		StringBuilder sb = new StringBuilder("start");
		System.out.println(sb);
		sb.append("+middle");
		System.out.println(sb);
		StringBuilder sb1 = sb.append("+end");
		
		StringBuilder s1 = new StringBuilder("abc");
		StringBuilder s2 = s1.append("de");
		
		//Append() method
		s2.append("fg");
		
		System.out.println(s1);
		
		//insert() method
		
		s1.insert(0, "-");
		s1.insert(3, true);
		
		System.out.println(s1);
		
		s1.delete(s1.indexOf("t"), (s1.indexOf("e")+1));
		System.out.println(s1);
		
		s1.deleteCharAt(s1.length()-1);
		
		System.out.println(s1);
		
		s1.replace(1, 100, "zyxwvu");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		s1.delete(s1.length()-1,s1.length());
		System.out.println(s1);
		
		String s3 = s1.toString();
		
		System.out.println(s3);
		
	}

}
