package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


	
public class SortMiddle  implements Comparator<SortMiddle>
{

	public int id;
	public String name;
	public String city;
	
	public SortMiddle(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

	public SortMiddle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "SortMiddle [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	@Override
	public int compare(SortMiddle o1, SortMiddle o2) {
		if(o1.id>o2.id)
		{
			return -1;
		}
		else 
			return 1;
	
	}
	public static void main(String[] args) {
		
		SortMiddle ob=new SortMiddle(122,"shuaib","haldwani");
		SortMiddle ob2=new SortMiddle(121,"sameer","nida");
		SortMiddle ob3=new SortMiddle(112,"nikhil","ntl");
		SortMiddle ob4=new SortMiddle(124,"bca","hyd");
		SortMiddle ob5=new SortMiddle(100,"abc","dli");
		ArrayList<SortMiddle> li=new ArrayList<SortMiddle>();
		li.add(ob);
		li.add(ob2);
		li.add(ob3);
		li.add(ob4);
		li.add(ob5);
		Collections.sort(li,new SortMiddle());
		
		for(SortMiddle e:li)
		{
			System.out.println(e);
		}
		
	}
	
	
	

}
