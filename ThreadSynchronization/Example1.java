package ThreadSynchronization;

public class Example1 extends Thread
{
	
	Activity activity;

	public Example1(Activity activity) 
	{
		this.activity = activity;
	}
	
	public void run()
	{
		activity.printValue(5);
	}
	
}
