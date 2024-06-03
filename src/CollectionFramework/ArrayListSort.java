package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort implements Comparator<Integer>{

	public static void main(String[] args) {
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(4);
		li.add(5);
		li.add(1);
		li.add(3);
		li.add(2);
		System.out.println("Before sort"+li);
		
		Collections.sort(li,new ArrayListSort());
		System.out.println("After sort"+li);

	}

	@Override
	public int compare(Integer i, Integer j) {
		
		if(i>j) {
			return -1;
		}
		else if(i<j)
			return 1;
		else
			return 0;
	}

	

}
