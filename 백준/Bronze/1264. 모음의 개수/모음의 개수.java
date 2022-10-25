import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean boo = true;
		
		while(boo) {
			String a = sc.nextLine();
			int cnt = 0;
			
			if (a.equals("#")) {
				boo = false;
				return;
			}
			char[] arr = a.toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
						arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}