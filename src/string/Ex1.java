package string;

public class Ex1 {

	public static void main(String[] args) {
		
		String str1 = "test";
		String str2 = "test"; // 상수풀에 있는 문자열을 공유
		
		String str3 = new String("test"); // 새로운 문자열을 생성
		
		// 두번째 방식은 메모리가 낭비되므로 첫번째 방식을 사용할 것
		
	}
}
