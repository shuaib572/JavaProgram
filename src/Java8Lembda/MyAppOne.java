package Java8Lembda;

interface MyInterfaceOne
{
	public void m1();
}

public class MyAppOne
{

	
	public static void main(String[] args) {
		
		 MyInterfaceOne mit=() -> System.out.println("m1 Methos called");
		 mit.m1();
	}
	
	
}
