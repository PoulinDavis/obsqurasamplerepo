package exceptionExample;

public class CustomeException {

	public static void main(String[] args) throws VottingException {
		// TODO Auto-generated method stub
		int age=16;
		if(age>=18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new VottingException("age under 18");
		}
	}

}
