package abstractclass;

abstract class Mobile
{
	abstract void setOs();
	void setDisplay() {
		System.out.println("10% is offer");
		System.out.println("Get deals");
	}
}
class AppleMobiles extends Mobile
{

	@Override
	void setOs() {
		System.out.println("OS set as apple");
		
	}
	
}
class SamsungMobiles extends Mobile
{

	@Override
	void setOs() {
		System.out.println("Os set as android");
		
	}
	
}

public class ABSdemo {

	public static void main(String[] args) {
		SamsungMobiles a = new SamsungMobiles();
		a.setOs();
		AppleMobiles b = new AppleMobiles();
		b.setOs();
		

	}

}
