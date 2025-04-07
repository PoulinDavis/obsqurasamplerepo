package inheritance;

public class SingleChild extends SingleParent {
	// TODO Auto-generated method stub
			public void display1()
			{
				System.out.println("hello Child");
			}
	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.display();
		obj.display1();
	}
	

}
