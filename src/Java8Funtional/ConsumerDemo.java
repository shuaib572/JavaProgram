package Java8Funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String> c=(name)->System.out.println("Welcome to "+name);
		c.accept("shuaib");
		c.accept("Sameer");
		List<Integer> list=Arrays.asList(1,23,43,54,31,21,12);
		list.forEach(i->System.out.println(i));
		
	}

}
