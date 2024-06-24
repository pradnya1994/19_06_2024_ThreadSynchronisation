package ThreadSynchronization;

public class Activity 
{

	public synchronized void printValue(int a)
	{
		int value = 1;

		while(value <= 10)
		{

			System.out.println(Thread.currentThread()+": "+value*a);
			value = value+1;

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
