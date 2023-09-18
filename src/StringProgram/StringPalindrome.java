package StringProgram;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("Not Palindroms");
	}
	

}
