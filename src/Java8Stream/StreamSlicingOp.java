package Java8Stream;

import java.util.Arrays;
import java.util.List;

public class StreamSlicingOp {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","Adv Java","SpringBoot","Rest API","AWS","SQL");
		list.stream().limit(3).forEach(i->System.out.println(i));
		System.out.println();
		list.stream().skip(3).forEach(i->System.out.println(i));
		
		System.out.println();
		List<Integer> num = Arrays.asList(1,5,3,5,3,4,3,3,2,4);
		num.stream().distinct().forEach(i->System.out.println(i));
		
	}
}
