package wrapper;

import java.util.ArrayList;

// Wrapper 클래스를 이용하여 리스트 생성하기
public class Ex4 {

	public static void main(String[] args) {
		
		// <E>: 리스트에 저장할 데이터 타입 (클래스타입만 가능)
		// boolean -> Boolean
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true); // new Boolean(true); // 오토박싱
		list.add(true);
		list.add(false);
		
		// boolean = (Boolean -> boolean) // 언박싱
		boolean b = list.get(0);
		
		
		
	}

}
