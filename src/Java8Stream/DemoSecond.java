package Java8Stream;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoSecond {
	public static void main(String[] args) {
		List<String> name=Arrays.asList("Anuj","prakash","Ahuaib","Jhon","Smit");
//		Stream<String> stream=name.stream();
//		Stream<String> filterStream=stream.filter(i->i.startsWith("A"));
//		filterStream.forEach(i->System.out.println(i));
		name.stream().filter(i->i.endsWith("h")).forEach(j->System.out.println(j));
	}

}
