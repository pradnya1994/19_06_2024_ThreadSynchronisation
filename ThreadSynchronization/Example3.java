package ThreadSynchronization;

public class Example3 extends Thread
{
	
	Activity activity;

	public Example3(Activity activity) 
	{
		this.activity = activity;
	}
	
	public void run()
	{
		activity.printValue(99);
	}
	
}
