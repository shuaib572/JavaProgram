package Java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PridicatePersionDemo {
	String name;
	int age;
	

	public PridicatePersionDemo(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		PridicatePersionDemo p1=new PridicatePersionDemo("shuaib",26);
		PridicatePersionDemo p2=new PridicatePersionDemo("nikhil",28);
		PridicatePersionDemo p3=new PridicatePersionDemo("gopal",32);
		PridicatePersionDemo p4=new PridicatePersionDemo("ankit",30);
		PridicatePersionDemo p5=new PridicatePersionDemo("jon",35);
		
		List<PridicatePersionDemo> persions=Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<PridicatePersionDemo> predicate =p->p.age<=30;
		for(PridicatePersionDemo per:persions)
		{
			if(predicate.test(per))
			{
				System.out.println(per.name);
			}
		}
		
	}
}
