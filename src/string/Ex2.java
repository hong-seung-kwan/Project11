package string;

public class Ex2 {

	public static void main(String[] args) {
		
		String str = "test";
		System.out.println(str.hashCode());
		
		str = "aaa";
		System.out.println(str.hashCode());

		// 문자열은 값을 변경할 수 없는 구조로,
		// 새로운 문자열을 생성하여 가리킨다
	}

}
