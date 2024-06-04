package Java8LembdaEx;

import java.util.StringJoiner;

public class StringJoines {

	public static void main(String[] args) {
		
		StringJoiner sj1=new StringJoiner("-");
		sj1.add("Java");
		sj1.add("is");
		sj1.add("Awsesome");
		System.out.println(sj1);
		
		StringJoiner sj2=new StringJoiner("-","(",")");
		sj2.add("java");
		sj2.add("is");
		sj2.add("awesome");
		System.out.println(sj2);
		
	}
}
