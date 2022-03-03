package interfaceclass;

interface Bank
{
	//int bankid =9001;
	void deposit();
	void withdraw();
}
interface Insurance
{
	void insureDeposit();
	
}
class HDFC implements Bank,Insurance
{
@Override
public void insureDeposit() {
	System.out.println("You can deposit upto 2lacs for month");
	
}

@Override
public void deposit() {
	System.out.println("You can get upto 4lacs per month");
	System.out.println("Welcome");
	
}

@Override
public void withdraw() {
	System.out.println("Withdraw upto 20k per day");
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Bank m = new HDFC();
		m.deposit();
		m.withdraw();
		Insurance a = new HDFC();
		a.insureDeposit();
		
		
		

	}

}
}
