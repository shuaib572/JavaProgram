package Java8Stream;

import java.util.Arrays;
import java.util.List;

// convert Uppercase Using Stream api transfrom data 

public class StreamMap {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("japan","india","usa","nepal","uk");
		/*System.out.println("Old way");
		for(String s:list)
		{
			System.out.println(s.toUpperCase());
		}*/
		//System.out.println("Using Stream Map Method");
		list.stream().map(p->p.toUpperCase()).forEach(n->System.out.println(n));
		// print length of each elements
		
		//list.stream().mapToInt(n->n.length()).forEach(i->System.out.println(i));
		list.stream().filter(i->i.startsWith("u"))
		.map(n->n +"-" +n.length()).forEach(i->System.out.println(i));
	}

}
