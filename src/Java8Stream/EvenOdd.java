package Java8Stream;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,23,42,1,33,32,56,78,76,99,88);
		list.stream().filter(i->i%2==0).forEach(i->System.out.println("Even Number"+i));
		list.stream().filter(i->i%2!=0).forEach(i->System.out.println("odd Number"+i));
	}

}
