package ma.java.scjp.test.assignment;

public class InitBlocksCallOrder {

	public static void main(String[] args) {
		new SubClass();
		if(true ^ false)
			System.out.println("Yes");
	}
}

class SuperClass{
	static { System.out.println("Static Init Block of Super");	}
	{System.out.println("Instance Init Block of Super");}
	public SuperClass() {
		System.out.println("Super Constructor");
	}
}

class SubClass extends SuperClass{
	static { System.out.println("Static Init Block of Sub"); }
	{System.out.println("Instance Init Block of Sub");}
	public SubClass() {
		System.out.println("Sub constructor");
	}
}