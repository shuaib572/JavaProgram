package CollectionFramework;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class StringWordCountHashMao {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		HashMap<String,Integer> hs=new HashMap<>();
	 
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
			{
				hs.put(arr[i],hs.get(arr[i])+1);
				
			}
			else
				hs.put(arr[i],1);
		}
		//System.out.println(hs);
		
		for(java.util.Map.Entry<String, Integer> e: hs.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
