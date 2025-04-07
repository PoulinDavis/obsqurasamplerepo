package inheritance;

public class MultilevelChild extends MultiLevelParentA {
	public void display2()
	{
		System.out.println("hai Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj1=new MultilevelChild();
		obj1.display();
		obj1.display1();
		obj1.display2();
	}

}
