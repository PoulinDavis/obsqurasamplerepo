package exceptionExample;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
	try
	{
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("got an Exception"+e);
		b=2;
		int d=a/b;
		System.out.println(d);
	}
	
}

}
