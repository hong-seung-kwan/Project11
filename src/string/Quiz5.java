package string;

// 문자열 꺼꾸로 출력
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);

//      1.		

		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());

//      2.		
//		String reverse = "";
//		// i의 초기값: 길이 - 1
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.println(str.charAt(i));
//			reverse = reverse + str.charAt(i);
//		}
//		System.out.println(reverse);
	}
}
