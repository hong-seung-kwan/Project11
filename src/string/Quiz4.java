package string;

public class Quiz4 {

	public static void main(String[] args) {
		System.out.println(getCharCount2("자바 프로그래밍 입문"));
		System.out.println(getCharCount2("equals 메소드는 두 객체가 같은지 비교한다"));
		int result = getCharCount2("자바 프로그래밍 입문");
		System.out.println(result);
		int result2 = getCharCount2("equals 메소드는 두 객체가 같은지 비교한다");
		System.out.println(result2);
		getCharCount3("자바 프로그래밍 입문");
		getCharCount3("equals 메소드는 두 객체가 같은지 비교한다");
		getCharCount4("자바 프로그래밍 입문");
	}

	// 1. 리턴값 o
	public static int getCharCount(String str) {
		int strLength = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				strLength++;
			}
		}
		return strLength;		
	}
	// 2. 리턴값 o
	public static int getCharCount2(String str) {
		String newStr = str.replace(" ", "");
		return newStr.length();
	}
	// 3. 리턴값 x
	public static void getCharCount3(String str) {
		String newStr = str.replace(" ", "");
		System.out.println(newStr.length());
	}
	public static void getCharCount4(String str) {
		int strLength = 0;
	// 4. 리턴값 x
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				strLength++;
			}
		}
		System.out.println(strLength);		
	}
}
