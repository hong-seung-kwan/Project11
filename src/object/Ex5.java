package object;

public class Ex5 {

	public static void main(String[] args) {
		
		// String 클래스의 toString, equals 함수 사용하기
		String str1 = new String("test");
		System.out.println(str1.toString()); // 문자열 출력
		
		// String 클래스의 toString 함수는 이미 재정의가 되어 있음
		
		String str2 = new String("test");
		
		// 두 문자열이 같은지 비교
		System.out.println(str1.equals(str2)); // true
		
		// String 클래스의 equals 함수는 이미 재정의가 되어 있음
	}
}

