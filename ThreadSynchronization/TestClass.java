package ThreadSynchronization;

public class TestClass 
{

	public static void main(String[] args) //main program/application/process
	{

		Activity activity = new Activity();
		
		Example1 example1 = new Example1(activity);
		example1.start();
		
		Example2 example2 = new Example2(activity);
		example2.start();
		
		Example3 example3 = new Example3(activity);
		example3.start();
	
		
	}

}
