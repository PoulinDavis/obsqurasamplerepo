package inheritance;

import accessModifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access1 obj=new Access1();
obj.displaypublic();//only get public outside pakage
Access3 obj1=new Access3();//extend cheyubol subclassine obj create cheyanam
obj1.displayprotected();
	}

}
