package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=sc.nextLine(); 
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		if(s1.length()==s2.length())
		{
		char []ch1=s1.toCharArray();
		Arrays.sort(ch1);
		char []ch2=s2.toCharArray();
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("Anagram");
			
		}
		
		else
		{
			System.out.println("not Anagram");
		}
		
//		 Own Addtnionl logic 
//		int c=0;
//		for(int i=0;i<ch1.length;i++)
//		{
//			if(ch1[i]!=ch2[i])
//			{
//				System.out.println("Not anagram");
//			}
//			else
//			{
//
//				c++;
//			}
//		}
//		if(c>0)
//		{
//			System.out.println("anagarm");
//		}
//		}
//		else
//		{
//			
	}
		
	}
}
