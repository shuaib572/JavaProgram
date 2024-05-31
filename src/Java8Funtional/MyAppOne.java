package Java8Funtional;

interface MyInterfaceOne
{
	public void m1();
}

public class MyAppOne
{

	
	public static void main(String[] args) {
		
		 MyInterfaceOne mit=() -> System.out.println("m1 Methos called"); // java 8
		 mit.m1();
	}
	
	
}
