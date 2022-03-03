package strings;

public class Tasks {
	int task1(String input) {
		int res =0;
		int rem =0;
		int result =0;
	
		for(int i=0; i<input.length();i++) {
			char c2=input.charAt(i);
			Character c =new Character(c2);
			if(c.isDigit(c2)) {
				
				}
				res =res+1;
				if(c>0) {
					rem =c%10;
					result =rem+result;
					
			}
			
		}
		
		return res;
	}
		
	
	public static void main(String[] args) {
		System.out.println(new Tasks().task1("Yaho123ABCD"));
		

	}

}
