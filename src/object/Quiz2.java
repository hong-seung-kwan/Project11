package object;

public class Quiz2 {

	public static void main(String[] args) {
		Object object = new Student(1001, "둘리");

		if (object instanceof Student) { // 타입체크
			Student student = (Student) object; // 다운캐스팅
			System.out.println(student.id);
			System.out.println(student.name);
		}

	}

}
