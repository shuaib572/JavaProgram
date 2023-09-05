package StringProgram;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String s1 = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s1 += (char) (s.charAt(i) + 32); // Convert uppercase to lowercase
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s1 += (char) (s.charAt(i) - 32); // Convert lowercase to uppercase
            } else {
                s1 += s.charAt(i); // Keep non-alphabetic characters unchanged
            }
        }
        
        System.out.println(s1);
    }
}
