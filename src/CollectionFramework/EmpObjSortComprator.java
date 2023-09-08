package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpObjSortComprator implements Comparator<EmpObjSortComprator>
{

	int id;
	String name;
	
	String city;
	
	
	public EmpObjSortComprator(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

	public EmpObjSortComprator() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "EmpObjSortComprator [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	@Override
	public int compare(EmpObjSortComprator o1, EmpObjSortComprator o2) {
		String s1=o1.name;
		String s2=o2.name;
		return s1.compareTo(s2);
	}
	public static void main(String[] args) {
		EmpObjSortComprator ob1=new EmpObjSortComprator(101,"abc","dli");
		EmpObjSortComprator ob2=new EmpObjSortComprator(103,"bca","mub");
		EmpObjSortComprator ob3=new EmpObjSortComprator(102,"cba","hyd");
		ArrayList<EmpObjSortComprator> li=new ArrayList<EmpObjSortComprator>();
		li.add(ob3);
		li.add(ob2);
		li.add(ob1);
		
		// Data Sort by name
		Collections.sort(li,new EmpObjSortComprator());
		for(EmpObjSortComprator e:li)
		{
			System.out.println(e.id+" "+e.name+" "+e.city);
		}
		
	}

}
