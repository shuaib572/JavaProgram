package NumberProgram;

public class FabinoSerice {
	public static void main(String[] args) {
		long a1 = 0;
		long a2 = 1;
		System.out.print(a1 + " " + a2 + " ");

		for (int i = 3; i <= 100; i++) {
			long a3 = a2 + a1;
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
		}
	}
}
