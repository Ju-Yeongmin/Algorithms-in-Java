import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		
		char[] list = new char[A.length()];
		for (int i = 0; i < A.length(); i++) {
			int a = A.charAt(i);
			if (a >= 65 && a <= 90) {
				a += 32;
			} else if (a >= 97 && a <= 122) {
				a -= 32;
			}
			System.out.print((char)a);
		}
	}
}