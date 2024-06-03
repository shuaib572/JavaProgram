package MultiThreading;

public class ThreadDemo extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Chlid Thread");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Program start");
		Thread t=new Thread(new ThreadDemo());
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(t.getName());
			System.out.println(t.getPriority());
			System.out.println(t.getClass());
		}
	}

}
