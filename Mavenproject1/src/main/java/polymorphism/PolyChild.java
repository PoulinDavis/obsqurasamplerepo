package polymorphism;

public class PolyChild extends PolyParent{
	public void sum(int a,int b)
	{super.sum(7, 3);
		int sum=a-b;
		System.out.println("child Rsult : "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyChild obj=new PolyChild();
obj.sum(4, 7);

	}

}
