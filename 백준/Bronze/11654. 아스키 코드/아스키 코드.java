import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String a = sc.next();
		
		int b = a.charAt(0);
		
		
		if ((b >= 48 && b <= 57) ||
				(b >= 65 && b <= 90) ||
				(b >= 97 && b <= 122)) {
			System.out.println(b);
		}
		
	}
}