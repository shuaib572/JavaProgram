package ArrayProgram;

public class ArraySort {
	public static void main(String[] args) {
		int arr[]= {1,5,3,9,7,4,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
				
			}
		}
		// Normal For Loop
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+" ");
//		}
		// For Each Loop
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}
