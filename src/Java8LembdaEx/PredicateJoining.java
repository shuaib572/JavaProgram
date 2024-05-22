package Java8LembdaEx;

import java.util.ArrayList;
import java.util.function.Predicate;

//Print Emp who are working in hyd location in db team

class Employee
{
	String name;
	String dept;
	String city;
	public Employee(String name, String dept, String city) {
		
		this.name = name;
		this.dept = dept;
		this.city = city;
	}
	
	
}
public class PredicateJoining {
	public static void main(String[] args) {
		Employee e1=new Employee("shuaib","JAVA","hyd");
		Employee e2=new Employee("ankit","AWS","dli");
		Employee e3=new Employee("gopal","testing","noida");
		Employee e4=new Employee("nikhil","JAVA","hyd");
		
		ArrayList<Employee> li=new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		Predicate<Employee> p1=(e)->e.city.equals("hyd");
		Predicate<Employee>p2=e->e.dept.equals("JAVA");
		Predicate<Employee> p=p1.and(p2);
		for(Employee e:li)
		{
			if(p.test(e))
			{
				System.out.println(e.name);
			}
		}
		
		
	}
}
