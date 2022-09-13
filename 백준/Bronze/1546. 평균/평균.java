import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		float total = 0;
		for (int i = 0; i < N; i++) {
			total += (float)arr[i]/max*100;
		}
		System.out.println(total / N);
				
	}
}