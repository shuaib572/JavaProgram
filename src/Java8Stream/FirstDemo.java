package Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream; 

public class FirstDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(121,44,76,88,5,11,34,12,15);
		System.out.println("Laggacy Approch");
		for(Integer i:list)
		{
			if(i<20)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Stream");
		Stream<Integer> stream=list.stream();
		Stream<Integer> filter=stream.filter(i->i<20);
		filter.forEach(i->System.out.println(i));
		
		System.out.println("Sort Way");
		
		list.stream().filter(i->i<20).forEach(i->System.out.println(i));
			
		}
		
	}


