package tns.exception;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d= 0;
		try {
			int a= 42/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled"+ e.getMessage());
		}
		
		System.out.println("Will not be printed");
	}
}
