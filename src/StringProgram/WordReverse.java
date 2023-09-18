package StringProgram;

import java.util.Scanner;

//Input is == welcome to java

public class WordReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
	   String nw="";
		String []s1=s.split(" ");
		String []sr=new String[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			String ch=s1[i];
			for(int j=ch.length()-1;j>=0;j--)
			{
			 nw+=ch.charAt(j);
			}
			nw+=" "; // Add a space after reversing each word
		}
		System.out.println(nw);
	}
}
