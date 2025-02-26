package string;

public class Quiz2 {

	public static void main(String[] args) {
		String a = "881120-4068234";
		
		// 특정 위치에 있는 문자를 추출
		char gen = a.charAt(7);
		
		if(gen == '1' || gen == '3') {
			System.out.println("성별은 남자입니다");
		} else if(gen == '2' || gen == '4') {
			System.out.println("성별은 여자입니다");
		}
	}
}
