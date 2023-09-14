package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class ListMidElement {
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(45);
		li.add(66);
		li.add(43);
		li.add(22);
		li.add(33);
		int s=li.size();
		System.out.println(li.get(s/2));
	}

}
