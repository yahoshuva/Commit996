package wrapperclass;

public class WrapperDemos {

	public static void main(String[] args) {
		int num=100;
		Integer i = new Integer(num);//Wrapper//wrapping/boxing
		
		System.out.println(i);
		System.out.println(i.floatValue());
		System.out.println(i.MAX_VALUE);
		System.out.println(i.MIN_VALUE);
		
		System.out.println(Integer.max(10,20));
		System.out.println(Integer.min(5,9));
		
		num =i;//Unwrapping//unboxing/(auto unboxing)
		System.out.println(num);
		
		num=i.intValue();
		System.out.println(num);
		
		char ch='A';
		Character x = new Character(ch);
		System.out.println(x.isDigit(ch));
		System.out.println(x.isLetter(ch));
		System.out.println(x.isUpperCase(ch));
		System.out.println(x.isLowerCase(ch));
		
		Double d  = new Double(10.45);
		System.out.println(d.intValue());
		System.out.println(d.MAX_VALUE);
		String val="100";
		int num1 = Integer.parseInt(val);
		System.out.println(num1);
		String v2=String.valueOf(num);
		String v3 =Integer.toString(num1);
		

	}

}
