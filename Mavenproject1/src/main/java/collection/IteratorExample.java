package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> names=new HashSet<String>();
names.add("tom");
names.add("poulin");
names.add("nora");
System.out.println(names);
Iterator obj=names.iterator();
while(obj.hasNext())
{
	System.out.println(obj.next());
}
obj.remove();
System.out.println(names);
	}

}
