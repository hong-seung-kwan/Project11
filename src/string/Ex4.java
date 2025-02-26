package string;

import java.util.Arrays;

// String 클래스의 함수
public class Ex4 {

	public static void main(String[] args) {
		
		String str = "java";
		
		System.out.println("0번째 위치의 문자: " + str.charAt(0));
		System.out.println("문자열길이 " + str.length());
		System.out.println("문자열 연결하기: " + str.concat("study"));
		
		System.out.println("av가 포함되는지 확인하기: "+ str.contains("av"));
		System.out.println("ja로 시작하는지 확인하기: "+ str.startsWith("ja"));
		System.out.println("va로 끝나는지 확인하기: " + str.endsWith("va"));
		
		System.out.println("같은 문자열인지 비교: " + str.equals("java"));
		System.out.println("대소문자 상관없이 비교: " + str.equalsIgnoreCase("JAVA"));
		System.out.println("문자v의 위치 찾기: "+ str.indexOf('v'));
		
		System.out.println("모든 문자열을 소문자로 변환: " + "AAA".toLowerCase());
		System.out.println("모든 문자열을 대문자로 변환: " + "aaa".toUpperCase());
		System.out.println("문자a를 c로 변경: "+ str.replace('a', 'c'));
		
		
		System.out.println("2번위치부터 4번위치전까지 자르기: " + str.substring(2, 4));
		System.out.println("문자열 양쪽에 공백이 있으면 제거:" + " ab cd ".trim());
		System.out.println("boolean을 문자열로 변환: " + String.valueOf(true));
		
		String str2 = "aa:bb:cc:dd";
		// 문자열을 구분자를 기준으로 자르는 메소드
		String[] arr = str2.split(":");
		System.out.println(Arrays.toString(arr));
		
		// String 클래스는 왜 이렇게 기능이 많을까..?
		// 우리가 프로그램에서 다루는 데이터의 종류: 문자열 문자 숫자 boolean ..
	}

}
