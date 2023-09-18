package StringProgram;

import java.util.Scanner;

public class RemoveExtraSpace { 
	
	// input ex=a   s   d    f d  s
	//output ex=a s d f d s
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String extra space");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
			
			}
			else
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
