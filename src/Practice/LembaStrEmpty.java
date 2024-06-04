package Practice;

import java.util.Scanner;
import java.util.function.Predicate;

public class LembaStrEmpty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Predicate<String> p=(str)->str.isEmpty();
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Given is empty:"+p.test(s));
	

	}

}
