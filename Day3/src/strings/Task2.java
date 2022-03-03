package strings;

public class Task2 {
	int task2(String input) {
		

	int sum =0;
	char ch[] =input.toCharArray();
	for(char c : ch){
	if(Character.isDigit(c))
	{
	sum=sum+Character.getNumericValue(c);
	}
	}
	return sum;
	}


	public static void main(String[] args) {
		System.out.println(new Task2().task2("ABD345Df"));

	}

}
