package NumberProgram;

import java.util.Scanner;

public class IntegerToBinary {
    public static int[] m1(int n) {
        System.out.println("Program Start");
        int result[] = new int[40];
        int index = 0;
        while (n > 0) {
            result[index++] = n % 2; // Store the remainder when dividing by 2
            n = n / 2; // Update n by dividing it by 2
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]); // Print the binary digits
        }
        System.out.println("\nProgram end");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int n = sc.nextInt();
        m1(n);
    }
}

