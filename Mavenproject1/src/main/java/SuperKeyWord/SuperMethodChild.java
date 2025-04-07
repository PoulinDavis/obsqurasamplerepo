package SuperKeyWord;

public class SuperMethodChild extends SuperMethod{
	public void print()
	{
		System.out.println("child");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperMethodChild obj1=new SuperMethodChild();
obj1.print();
	}

}
