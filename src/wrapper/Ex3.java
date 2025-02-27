package wrapper;

// Integer 클래스 메소드 사용하기
public class Ex3 {

	public static void main(String[] args) {
		
		// 문자열을 이용하여 Integer 생성하기
		// "100" -> 100
		Integer iNum1 = Integer.valueOf("100");
		
		// 정수를 입력하여 Integer 생성하기
		Integer iNum2 = Integer.valueOf(100);
		
		// 형변환
		// 문자열 -> 정수
		// "100" -> 100
		int num = Integer.parseInt("100");
		
		// 정수 -> 문자열
		// toString
		// Integer 클래스는 object한테 물려받은 toString함수를 재정의했다
		String str = iNum1.toString();
		System.out.println(str);
	}

}
