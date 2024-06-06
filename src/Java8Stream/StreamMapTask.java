package Java8Stream;

import java.util.Arrays;
import java.util.List;

// Get Emp name, emp age whose salary <=15000

class Employee{
	public String name;
	public int age;
	public int salary;
	public Employee(String name, int age, int salar) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salar;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salar=" + salary + "]";
	}
	
}
public class StreamMapTask {
public static void main(String[] args) {
	
	Employee e1=new Employee("shuaib",22,17000);
	Employee e2=new Employee("samerr",25,18000);
	Employee e3=new Employee("Prashant",27,15000);
	Employee e4=new Employee("Jon",26,14000);
	Employee e5=new Employee("Anil",21,13000);
	List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5);
	list.stream().filter(i-> i.salary>15000).forEach(n->System.out.println(n.name+"-"+n.age));
	
	list.stream().filter(i->i.salary>15000)
	.map(n->n.name+"-"+n.age).forEach(i->System.out.println(i));
}	

}
