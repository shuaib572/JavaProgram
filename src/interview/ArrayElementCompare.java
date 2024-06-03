package interview;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayElementCompare {
	
	public boolean compareArray(int arr1[],int arr2[])
	{
		if(arr1.length != arr2.length)
		{
			return false;
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
			{
				return true;
			}
			
		}
		
		
		
		
		return false;
		
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5};
		int arr2[]= {2,1,5,4};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayElementCompare ob=new ArrayElementCompare();
		System.out.println(ob.compareArray(arr1, arr2));
		

		
	}

}
