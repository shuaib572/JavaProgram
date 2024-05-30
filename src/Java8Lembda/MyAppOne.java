package Java8Lembda;

interface MyInterfaceOne
{
	public void m1();
}

public class MyAppOne implements MyInterfaceOne{

	@Override
	public void m1() {
	System.out.println("My m1 Method Called");
		
	}
	public static void main(String[] args) {
		MyAppOne ob=new MyAppOne();
		ob.m1();
	}
	
	
}
