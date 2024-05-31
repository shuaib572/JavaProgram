package Java8Funtional;

import java.util.function.Predicate;

//Declare Names in an array and print names which are staring with "A' usig lamba expression

public class PredicateTask {
	public static void main(String[] args) {
		String names[]= {"Anuksha","Anupama","Sameer","Shaban","Deepika","Sunny"};
		Predicate<String>p=name-> name.charAt(0)=='A';
		for(String name:names)
		{
			if(p.test(name))
			{
				System.out.println(name);
			}
		}
	}

}
