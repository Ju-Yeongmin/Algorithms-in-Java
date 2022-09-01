import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int max = -1000000 ;
		int min = 1000000;
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
			if (max < list[i]) {
				max = list[i];
			}
			
			if (min > list[i]) {
				min = list[i];
			}
		}
		
		System.out.print(min + " ");
		System.out.print(max);
		
	}
}