package string;

// StringBuilder 클래스
// String 클래스의 단점을 보완하는 클래스
public class Ex3 {

	public static void main(String[] args) {
		
		// String 클래스는 값을 자주 변경하면 메모리가 낭비된다
		// 자주 변경이 될때는 StringBuilder 클래스를 사용한다

		String str = "java";
		System.out.println(str.hashCode());
		str = str + " and";
		System.out.println(str.hashCode()); // 주소가 변경됨
		str = str + " android ";
		System.out.println(str.hashCode());
		
		StringBuilder builder = new StringBuilder("java");
		System.out.println(builder.hashCode());
		//
		builder.append(" and");
		System.out.println(builder.hashCode());
		builder.append(" andriod");
		System.out.println(builder.hashCode());
		System.out.println(builder);
		
		// StringBuilder는 인스턴스를 새로 생성하지 않고
		// 문자열을 수정하는 구조
	}

}
