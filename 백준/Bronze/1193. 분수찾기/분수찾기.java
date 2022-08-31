import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int Y = X;
		int a = 0;
		int sum = 0;
		while (X >= 1) {
			a++;
			sum += a;
			X -= a;
		}
		
		if (a % 2 == 0) {
			System.out.printf("%d/%d",a+X ,a-(Y-(sum-a))+1 );
		} else {
			System.out.printf("%d/%d",a-(Y-(sum-a))+1 ,a+X);
		}
		
	}
}