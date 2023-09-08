package Java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c=(name)->System.out.println(name+" Good Moring");
		c.accept("shuaib :");
		c.accept("nikhil :");
		c.accept("gopal :");
		List<Integer> li=Arrays.asList(10,20,56,46,54);
		li.forEach(i->System.out.println(i));
	}
}
