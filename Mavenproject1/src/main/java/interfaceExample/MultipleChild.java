package interfaceExample;

public class MultipleChild implements MultipleParentA,MultipleParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj1=new MultipleChild();
		obj1.print();
		obj1.display();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("parent B");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Parent A");
	}

}
