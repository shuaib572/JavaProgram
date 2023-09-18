package StringProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateWord2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		using List
		System.out.println("Enter String");
		String s=sc.nextLine();
			String []words=s.split(" ");
			ArrayList<String> li=new ArrayList<String>();
			for(String var:words)
			{
				if(!li.contains(var))
				{
					li.add(var);
				}
			}
					System.out.println(li);
		
	}
}
