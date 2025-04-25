package interfaceExample;

public class InterfaceChild implements Interface1{
public void sum()
{
	System.out.println("sum");
}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceChild obj1=new InterfaceChild();
		//Interface1 obj1=new InterfaceChild();
obj1.display();
obj1.print();
obj1.sum();//childille villikan pattila

	}

}
