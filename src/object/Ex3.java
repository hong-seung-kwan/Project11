package object;

public class Ex3 {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");

		// 비교연산자를 사용하여 비교
		// 내용은 같지만 주소가 다르므로 거짓
		System.out.println(student1 == student2); // false
		System.out.println(student1.equals(student2)); // false

		// 인스턴스 주소 비교하기
		// 오버라이드된 함수가 없으면 함수의 원형이 호출된다
		
	}

}

// 학생
class Student {
	int id;
	String name;

	// 모든 멤버변수를 초기화하는 생성자
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// Object(부모)가 물려준 함수 중에서 equals 함수를 재정의
	// 자식에 맞는 내용으로 수정하기!
	@Override
	public boolean equals(Object obj) {

		// 먼저 매개변수가 학생 인스턴스인지 확인
		if (obj instanceof Student) {
			Student student = (Student) obj; // 다운캐스팅
			// 나의 학번 == 비교대상의 학번
			if (id == student.id) {
				return true;
			}

		}
		return false;
	}
	// 매개변수가 학생이고 학번이 같다면 true 반환
	// 그렇지 않으면 false 반환
}