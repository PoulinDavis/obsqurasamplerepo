package accessModifiers;

public class Access1 {
public void displaypublic()
{
	System.out.println("public");
}
private void displayprivate()
{
	System.out.println("private");
}
protected void displayprotected()
{
	System.out.println("protected");
}
void displaydefault()
{
	System.out.println("default");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access1 obj1=new Access1();
obj1.displaydefault();
obj1.displayprivate();
obj1.displayprotected();
obj1.displaypublic();
	}

}
