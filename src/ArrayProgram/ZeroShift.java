package ArrayProgram;

public class ZeroShift {
	public static void main(String[] args) {
		int arr[]= {3,0,7,8,0,2};
		//output Req=3,7,8,2,0,0 only zero shift in last
		int newArr[]=new int[arr.length];
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newArr[temp]=arr[i];
				temp++;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(newArr[j]+" s");
		}
	}

}
