import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[9];
		int max = 0;
		for (int i = 0; i < 9; i++) {
			list[i] = sc.nextInt();
			
			if (max < list[i]) {
				max = list[i];
			}
		}
		
		int n = 0;
		for (int j = 0; j < 9; j++) {
			n++;
			if (max == list[j]) {
				break;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		
	}
}
