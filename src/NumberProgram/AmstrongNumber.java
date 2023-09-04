package NumberProgram;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		// Count inputNumber Number
		
		int nCount=n;
		int nSum=nCount;
		int count=0;
		while(nCount!=0)
		{
			nCount=nCount/10;
			count++;
		}
		//main Code
		int sum=0;
		while(nSum!=0)
		{
			int reminder=nSum%10;
			sum+=Math.pow(reminder, count);
			nSum=nSum/10;
		}
		if(n==sum)
			System.out.println(n+" :is Amstrong Number");
		else
			System.out.println(n+": Is Not Amstrong Number");
		sc.close();
	}
}
