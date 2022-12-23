import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ((a+b)%2 != 0 || (a-b)%2 != 0) {
			System.out.println("-1");
		} else if (a < 0 || b < 0 || (a+b) < 0 || a-b < 0){
			System.out.println("-1");
		}
		else {
			System.out.println((a+b)/2 + " " + (a-b)/2);
		}
		
		
		
	}
}