import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum1 = a * (b%10);
		int sum2 = a * ((b%100)/10);
		int sum3 = a * (b/100);
		int sum = a * b;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum);
	}
}