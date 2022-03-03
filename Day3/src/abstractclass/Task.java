package abstractclass;

abstract class HODelhi{
	
	abstract void IDverification();
	void finalapproval() {
		System.out.println("Here is Completion approval confromation");
		
	}
}
	class Banglore extends HODelhi{

		@Override
		void IDverification() {
			System.out.println("Here we take ration card as idenfication");
		}
		
	}
	class Chennai extends HODelhi{

		@Override
		void IDverification() {
			System.out.println("Here we take driver license as idenftication");
			
		}
		
	}


public class Task {

	public static void main(String[] args) {
		HODelhi  m = new Banglore();
		m =new Chennai();
		
		m.IDverification();
		m.IDverification();
		m.finalapproval();
		
	
		

	}

}
