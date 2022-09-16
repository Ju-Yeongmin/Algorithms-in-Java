import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr28 = new int[28];
		int[] arr30 = new int[30];
		for (int i = 0; i < 28; i++) {
			arr28[i] = sc.nextInt();
		}
		
		for (int j = 0; j < 28; j++) {
			arr30[arr28[j]-1] = arr28[j];
		}
		
		for (int k = 0; k < 30; k++) {
			if (arr30[k] == 0) {
				System.out.println(k+1);
			}
		}
	}
}