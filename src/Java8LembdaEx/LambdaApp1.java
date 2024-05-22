package Java8LembdaEx;


interface Fun{
	void m1();
}
public class LambdaApp1

{
	public static void main(String[] args) {
	Fun fi=	()->{
			System.out.println("m1 methid called");
		};
		fi.m1();
	}
}
