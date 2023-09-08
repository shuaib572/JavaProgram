package Java8Program;

import java.util.function.Predicate;

public class PridacateDemo2 {
	public static void main(String[] args) {
		String [] names= {"Shuaib","Ankit","Gopal","Nikhil","Shaban"};
		Predicate<String> p=name->name.charAt(0)=='S';
		for(String name:names)
		{
			if(p.test(name))
			{
				System.out.println(name);
			}
		}
	}

}
