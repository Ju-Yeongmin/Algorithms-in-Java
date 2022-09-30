import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (s.length() >= 6 && s.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
	}
}