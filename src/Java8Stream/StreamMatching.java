package Java8Stream;

import java.util.Arrays;
import java.util.List;

class Person{
	
	String name;
	String city;
	Person(String name, String city)
	{
		this.name=name;
		this.city=city;
	}
}
public class StreamMatching {
	public static void main(String[] args) {
		
		Person p1=new Person("Ashok", "India");
		Person p2=new Person("Sameer","Duabi");
		Person p3=new Person("Prashant", "India");
		Person p4=new Person("Shaban","USA");
		Person p5=new Person("Shuaib","Oman");
		
		List<Person> person= Arrays.asList(p1,p2,p3,p4,p5);
		boolean status1= person.stream().anyMatch(p->p.city.equalsIgnoreCase("india"));
		System.out.println("Any Indian avilabe is:: "+status1);
		boolean status2= person.stream().allMatch(p->p.city.equalsIgnoreCase("india"));
		System.out.println("All are Indians avilabe is:: "+status2);
		
		boolean status3= person.stream().noneMatch(p->p.city.equalsIgnoreCase("india"));
		System.out.println("Non Match is India:: "+status3);
	}

}
