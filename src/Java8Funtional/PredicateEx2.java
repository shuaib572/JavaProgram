package Java8Funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Ex- Take list of person and print person whose age us >=18 using lembda expression

class Person
{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}


public class PredicateEx2 {
	
public static void main(String[] args) {
	
	Person p1=new Person("shuaib", 21);
	Person p2=new Person("sameer", 25);
	Person p3=new Person("aleem", 22);
	Person p4=new Person("shaban", 16);
	Person p5=new Person("xyz", 15);
	
	List<Person> persons=Arrays.asList(p1,p2,p3,p4,p5);
	
	Predicate<Person> predicate=p-> p.age>=18;
	
	for(Person person:persons) {
		if(predicate.test(person))
		{
			System.out.println(person.name);
		}
	}
}

}
