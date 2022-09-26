import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		long result = N-M;
		if (result < 0) {
			result = -result;
		}
		
		System.out.println(result);
	}
}
