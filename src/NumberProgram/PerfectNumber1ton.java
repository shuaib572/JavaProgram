package NumberProgram;

import java.util.Scanner;

public class PerfectNumber1ton 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		 for (int i = 1; i < n; i++) 
		 {
	            int sum = 0;
	            for (int j = 1; j < i; j++) 
	            {
	                if (i % j == 0) 
	                {
	                    sum += j;
	                }
	            }

	            if (sum == i)
	            {
	                System.out.println(i + " is a Perfect Number");
	            }
	        }
	}

}
