package StringProgram;

import java.util.Scanner;

public class SpaceRepalce {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String");
//		String s=sc.nextLine();
		String s1="welcome to java";
		String []s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]+"-");
		}
		
	}

}
