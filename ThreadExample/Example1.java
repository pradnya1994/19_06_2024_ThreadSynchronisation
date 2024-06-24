package ThreadExample;

public class Example1 implements Runnable
{

	@Override
	public void run() 
	{
		int value = 1;
		 
		while(value <= 100)
		{
			System.out.println(Thread.currentThread()+": "+value);
			value = value+1;
			
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
}
