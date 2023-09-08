package Java8Program;

import java.util.function.Function;

public class FuncationDemo {
	public static void main(String[] args) {
		Function<String,Integer> fn=(name)->name.length();
		Function<String,Character> fn1=(name)->name.charAt(0);
		System.out.println(fn.apply("shuaib"));
		System.out.println(fn1.apply("java"));
	}
}
