package StringProgram;

import java.util.Scanner;

public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length()-1;i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
		
			}
			if(count>1 && s.charAt(i)!=' ')
			{
				System.out.println("Duplicate Characters is"+s.charAt(i)+":"+count);
			}
		}
	}

}
