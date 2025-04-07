package aggregation;

public class AggregationChild {
String city;
String state;
AggregationSample ref;
	public AggregationChild(String city,String state,AggregationSample ref)
	{
		this.ref=ref;
		this.city=city;
		this.state=state;
	}
	public void dispaly()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+city+" "+state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AggregationSample obj=new AggregationSample("joe",2,"tevdv");
AggregationChild obj1=new AggregationChild("tsr","kerala",obj);
obj1.dispaly();
	}

}
