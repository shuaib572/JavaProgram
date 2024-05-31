package Java8Funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Print Employee name whoes are working in hyd location and DB Team Ex- predicate joining
// Predicate Joining
class Employee{
	String name;
	String location;
	String dept;
	
	Employee(String name,String location, String dept)
	{
		this.name=name;
		this.location=location;
		this.dept=dept;
		
	}
}
public class PredicateJoiningEx {
	public static void main(String[] args) {
		Employee e1=new Employee("shuaib","hyd","DB");
		Employee e2=new Employee("prashanr","dli","network");
		Employee e3=new Employee("aleem","noida","IT");
		Employee e4=new Employee("javed","dli","DevOps");
		List<Employee> emps=Arrays.asList(e1,e2,e3,e3);
		
		Predicate<Employee> p1=e->e.location.equals("hyd");
		Predicate<Employee> p2=(e)->e.dept.equalsIgnoreCase("db");
		
		Predicate<Employee> p=p1.and(p2);
		for(Employee employee:emps)
		{
			if(p.test(employee))
			{
				System.out.println(employee.name);
			}
		}
	}

}
