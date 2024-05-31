package Java8Lembda;

import java.util.function.Predicate;

public class PridicateDemo {
	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i>10;
				boolean b=p.test(15);
				System.out.println(b);
				System.out.println(p.test(5));
	}

}
