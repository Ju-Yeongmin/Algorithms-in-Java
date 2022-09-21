import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();
		
		int b = ((a1*a1)+(a2*a2)+(a3*a3)+(a4*a4)+(a5*a5)) % 10;
		System.out.println(b);
	}
}
