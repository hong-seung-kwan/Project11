package string;

// 문자열 꺼꾸로 출력
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		System.out.println(str);
		
//		StringBuilder builder = new StringBuilder(str);
//		System.out.println(builder.reverse());
		
		
		
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(0));
		
		String reverse = "";
		for(int i = 4; i >= 0 ; i-- ) {
//			System.out.println(str.charAt(i));
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}
