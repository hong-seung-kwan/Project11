package wrapper;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		// 오토박싱
		list.add('a'); // list.add(new Character('a')) 
		list.add('b');
		list.add('c');
		list.add('d');
		
		// 언박싱
		char c = list.get(0); // list.get(0).charValue() 
		
	}

}
