package Java8LembdaEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortLembda {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(4);
		li.add(5);
		li.add(1);
		li.add(3);
		li.add(2);
		System.out.println("Before sort"+li);
		//Collections.sort(li,(i,j)->i.compareTo(j)); sort Assending Order
		
		Collections.sort(li,(i,j)->(i>j)?-1:1); // sort desending order
		System.out.println(li);

	}

}
