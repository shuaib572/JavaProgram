package Java8LembdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return -1;
		else if(o2>o1)
			return 1;
		else 
			return 0;
	}
	
}
public class LambdaSort {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(40);
		li.add(30);
		li.add(20);
		li.add(50);
		li.add(35);
		//Collections.sort(li,new Test());
		//Collections.sort(li,(a,b)->a.compareTo(b));
		Collections.sort(li,(a,b)->(a>b)?-1:1);
		System.out.println(li);
		
	}
}
