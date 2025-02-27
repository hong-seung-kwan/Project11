package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		// while(조건) : 조건을 만족할 때까지 반복
		// 조건이 항상 true라면 무한루프에 빠진다
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			
//			if(str.equals("END") || str.equals("end")) {		
//				break;
//			}
			// equalsIgnoreCase: 대소문자 상관없이 비교
			if(str.equalsIgnoreCase("end")) {
				break;
			}
//			if(str.toLowerCase().equals("end") ) {
//				break;
//			}
			// toUpperCase : 문자열을 대문자로 변환
			if("END".equals(str.toUpperCase())) {
				break;
			}
			
		}

	}

}
