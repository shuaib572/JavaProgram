package StringProgram;

import java.util.Scanner;

public class CountNonRepeatedCharacterStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int arr[]=new int[s.length()];
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
		}
	}

}
