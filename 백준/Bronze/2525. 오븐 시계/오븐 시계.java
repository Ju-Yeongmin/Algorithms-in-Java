import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int time = A*60 + B + C;
		if (time >= 1440) {
			time -= 1440;
		}
		int h = time / 60;
		int m = time % 60;
		
		System.out.printf("%d %d", h, m);
		
	}
}
