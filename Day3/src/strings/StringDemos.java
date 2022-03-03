package strings;

public class StringDemos {

	public static void main(String[] args) {
		// creating string
		
//		String s1="hello";
//		String s2=new String("Hello");
//		char arr[] = {'a','n','t'};
//		String s3=new String(arr);
//		byte arr2[]= {'a','n','t'};
//		String s4=new String(arr2);
//		String s5 =new String(s1);
//		
//		String s6=s1;
//		String s7=new String(arr2,0,2);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
//		System.out.println(s7);
//		
//		
		
		String s="sparta";
		System.out.println(s.charAt(0));
		String s2="SPARTA";
		System.out.println(s.compareTo(s2));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.indexOf('p'));
		System.out.println(s.indexOf("art"));
		System.out.println(s.length());
		
		/////
		System.out.println(s.concat("ns"));
		System.out.println(s.replace('a', 'o'));
		System.out.println(s.replace("art", "ark"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0,3));
		System.out.println(s2.trim().length());
		
		
		
		
		}

	}


