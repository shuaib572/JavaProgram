package interview;

public class CountNonRepeatedCharacterStr {
	public static void main(String[] args) {
		String s="abcdaas";
		int len=s.length();
		int arr[]=new int[len];
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j)) //i=0;count=0 ,w
				{
					count ++; // 1
				}
			}
			arr[i]=count;
			count=0;
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
