package Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {
	public static void main(String arg[]) {
		
		List<String> java=Arrays.asList("java","j2ee","springboot","sql");
		List<String> ui=Arrays.asList("html","css","js","bs");
		List<List<String>> list=Arrays.asList(java,ui);
		
	//	list.stream().forEach(i->System.out.println(i));
		
		Stream<String> flatmap=list.stream().flatMap(i->i.stream());
		flatmap.forEach(i->System.out.println(i));

	}

}
