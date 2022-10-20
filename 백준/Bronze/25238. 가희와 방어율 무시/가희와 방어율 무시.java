import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = (int)(a - (a*b/100.0));
		
		if ((a >= 0 && a <= 500) && (b >= 0 && b <= 100)) {
			if (result >= 100) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
	}
}
