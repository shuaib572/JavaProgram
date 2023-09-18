package ArrayProgram;

import java.util.Scanner;

public class InputConsole {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=sc.nextInt();
		int []arr=new int[n];   
		System.out.println("Enter "+n+"Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	//	Array print
			for(int s:arr)
			{
				System.out.print(s+" ");
			}
	}
}
