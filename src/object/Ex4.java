package object;

public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");

		// java는 참조변수를 출력할때 toString 함수를 호출하도록 설계되어있음
		System.out.println(book.toString()); // 객체의 주소
		System.out.println(book); // 위와같음 (자동으로 toString 호출)

		// 책의 주소 대신 내용 출력하기!
	}

}

class Book {

	int bookNumber;
	String bookTitle;

	// 모든 멤버변수를 초기화하는 생성자
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	// generate 기능을 사용하여
	// 클래스 멤버변수를 이용하여 toString 메소드를 자동으로 재정의
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
}