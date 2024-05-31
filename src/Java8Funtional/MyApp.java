package Java8Funtional;

interface MyAppIn{
	public void m1();
}
public class MyApp implements MyAppIn {

	@Override
	public void m1() {
		System.out.println("M1 Method Called");
		
	}
	public static void main(String[] args) {
		MyApp ob=new MyApp();
		ob.m1();
		
	}
	

}
