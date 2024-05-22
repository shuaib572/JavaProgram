package Java8LembdaEx;

import java.util.function.Predicate;

public class PridicateDemo1 {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		
			boolean s=p.test(20);
			System.out.println(s);
			System.out.println(p.test(5));
		
	}

}
