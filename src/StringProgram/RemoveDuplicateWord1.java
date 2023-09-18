package StringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWord1 {
	public static void main(String[] args) {
// using set		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			lhs.add(s1[i]);
		}
		System.out.println(lhs);

	}

}
