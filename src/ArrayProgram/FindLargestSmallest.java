package ArrayProgram;

public class FindLargestSmallest {
	public static void main(String[] args) {
		int []arr= {2,7,8,5,3,6,41,1,0};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
