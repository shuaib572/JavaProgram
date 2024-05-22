package Java8LembdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Persion
{
	String name;
	int age;
	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class PersionPredicate 
{
	public static void main(String[] args) {
		Persion p1=new Persion("shuaib", 28);
		Persion p2=new Persion("nikhil",23);
		Persion p3=new Persion("ankit", 25);
		List<Persion> li=Arrays.asList(p1,p2,p3);
		Predicate<Persion> predicate=p->p.age>=25;
		for(Persion persion:li)
		{
			if(predicate.test(persion))
			{
				System.out.println(persion.name);
			}
		}
		
	}
}

