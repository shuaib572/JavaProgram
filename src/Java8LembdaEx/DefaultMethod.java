package Java8LembdaEx;

interface Vehicle
{
	public void start();
}
public class DefaultMethod implements Vehicle{

	@Override
	public void start() {
		System.out.println("Engine Start");
		
	}
	public static void main(String[] args) {
		
		DefaultMethod ob=new DefaultMethod();
		ob.start();
	}

}
