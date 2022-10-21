import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean boo = true;
		
		while (boo) {
			String a = sc.next();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a.equals("#") && b == 0 && c ==0) {
				boo = false;
			} else {
				if (b > 17 || c >= 80) {
					System.out.println(a + " Senior");
				} else {
					System.out.println(a + " Junior");
				}
			}
		}
	}
}