package wrapper;

// nextLine 메소드를 사용하여 정수 두개 받기
// 그리고 두 수를 더한 결과 출력
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		int num1 = Integer.parseInt(str1); // "10" -> 10
		int num2 = Integer.parseInt(str2); // "5" -> 5
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 
		System.out.println(num1 + num2); // +기호는 더하기 연산자(정수기때문에)
	}
}
