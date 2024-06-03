package Java8Funtional;

import java.util.function.BiFunction;

public class SumOfTwo {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer> bf=(a,b)-> a+b;
			System.out.println(bf.apply(21, 12));
		
	}

}
