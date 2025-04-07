package inheritance;

public class TotalSalary extends HraPf{

	public void display()
	{
		int totalsalary=basic+hra+bonus-dedection-pf;//17000+850+3000-2000-3400
		System.out.println("Total Salary : "+totalsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TotalSalary obj1=new TotalSalary();
obj1.display();
	}

}
