package Java8Stream;

import java.util.Arrays;
import java.util.List;

class User{
	int age;
	String name;
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class Ex3 {
	public static void main(String[] args) {
		
		User u1=new User(18,"Radha");
		User u2=new User(15,"Rani");
		User u3=new User(31,"Akash");
		User u4=new User(30,"Sameer");
		List<User> name=Arrays.asList(u1,u2,u3,u4);
		
		name.stream().filter(i->i.age>18 & i.name.startsWith("A")).forEach(u->System.out.println(u));
		
		name.stream().filter(i->i.age>18)
		.filter(i->i.name.startsWith("A")).forEach(i->System.out.println(i));
		
		
	}
}
