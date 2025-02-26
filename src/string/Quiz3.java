package string;

public class Quiz3 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";

		System.out.println(str.length());

//		// 공백제외한 문자길이
//		int strLength = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != ' ') { // i번째 위치 돌면서 공백 체크
//				strLength++; // 공백 아닐시 카운트
//			}
//		}
//		System.out.println(strLength);
		// 2. replace로 공백 제거
		String newStr = str.replace(" ", "");
		System.out.println(newStr + " "+ newStr.length());
	}
}
