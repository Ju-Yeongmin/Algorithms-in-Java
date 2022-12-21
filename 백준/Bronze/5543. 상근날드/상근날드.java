import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		int bmin = 0;
		int dmin = 0;
		
		bmin = b1;
		
		if (bmin > b2) {
			bmin = b2;
		}
		if (bmin > b3) {
			bmin = b3;
		}
		
		dmin = d1;
		
		if (dmin > d2) {
			dmin = d2;
		}
		
		System.out.println(bmin+dmin-50);
		
		
		
	}
}