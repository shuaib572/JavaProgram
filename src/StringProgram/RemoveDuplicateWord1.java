package StringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWord1 {
	public static void main(String[] args) {
// using set		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			lhs.add(s1[i]);
		}
	System.out.println(lhs);	
	
	removeDuplicate(s);
	}
	
	
//	using List
	
	public static void removeDuplicate( String s)
	{
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
