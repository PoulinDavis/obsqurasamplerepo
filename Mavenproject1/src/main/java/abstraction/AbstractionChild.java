package abstraction;

public class AbstractionChild extends AbstrationParent{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstarct method body");
	}
	public void print() {
		System.out.println("print methodd");
	}
public static void main(String args[])
{
	//AbstractionChild obj1= new AbstractionChild();
	AbstrationParent obj1 =new AbstractionChild();
	obj1.display();
	obj1.sum();
	//obj1.print();
}
}
