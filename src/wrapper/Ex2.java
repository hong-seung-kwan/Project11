package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		
		// Integer 인스턴스 생성
		// Integer 클래스는 인스턴스를 생략할 수 있다
		Integer iNum1 = new Integer(100);
		
		// Integer = int (int -> Integer)
		Integer iNum2 = 100; // new Integer(100) 와 같음
		
		// intValue: Integer 안에 있는 값 꺼내기
		int num1 = iNum1.intValue();
		// int = Integer (Integer->int) 
		int num2 = iNum2; // iNum2.intValue() 와 같음
		
		// int = Integer + int
		// 참조형 기초형 연산 가능
		int num3 = iNum2 + 100;
		
		// Boolean
		// Boolean 클래스는 인스턴스를 생성할 필요가 없다
		Boolean bool1 = new Boolean(true);
		// Boolean = boolean
		Boolean bool2 = true; // new Boolean(true)와 같다
		
		// booleanValue: Boolean 안에 있는 값을 꺼내는 함수
		boolean b1 = bool1.booleanValue();
		// boolean = Boolean
		boolean b2 = bool1; // bool1.booleanValue() 와 같다
		
		// Character
		
		Character char1 = new Character('a');
		Character char2 = 'a'; // 바로 값을 대입
		
		char c1 = char2.charValue(); // 값 꺼내기
		// char = Character
		char c2 = char2; // 자동추출
				
	}

}
