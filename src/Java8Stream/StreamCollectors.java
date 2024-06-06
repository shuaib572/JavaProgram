package Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Collect names of preson who are belongs  to india and store  into names collections


class Person1{
	
	String name;
	String city;
	Person1(String name, String city)
	{
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
}
public class StreamCollectors {
	
	public static void main(String[] args) {
		
		Person1 p1=new Person1("Ashok", "India");
		Person1 p2=new Person1("Sameer","Duabi");
		Person1 p3=new Person1("Prashant", "India");
		Person1 p4=new Person1("Shaban","USA");
		Person1 p5=new Person1("Shuaib","Oman");
		
		List<Person1> person= Arrays.asList(p1,p2,p3,p4,p5);
		
		
		List<Person1> collect = person.stream().filter(i->i.city.equals("India")).collect(Collectors.toList());
		
		System.out.println(collect.size());
		System.out.println(collect);
		
		System.out.println();
		// Collect names of preson who are belongs  to india and store  into names collections
		
		
		List<String> names=person.stream().filter(i->i.city.equalsIgnoreCase("india"))
						.map(i->i.name).collect(Collectors.toList());
		names.forEach(i->System.out.println(i));
						
		
		
	}
}
