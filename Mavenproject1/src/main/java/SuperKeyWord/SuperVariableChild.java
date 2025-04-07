package SuperKeyWord;

public class SuperVariableChild extends SuperKeyParent {
String colour="blue";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String colour="blue";
SuperVariableChild obj1=new SuperVariableChild();
obj1.dispaly();
	}
	public void dispaly()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
