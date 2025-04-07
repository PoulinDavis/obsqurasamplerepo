package mavenpakage1;

public class maven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maven1.fact();
	}

public static void fact()
{
	int num=5;
	int fact=1;
	for(int i=1;i<=5;i++) {
		fact=fact*i;
	}
	System.out.println("FActorial of "+num+" is "+fact);
}
}
