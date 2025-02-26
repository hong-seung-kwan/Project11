package object;

public class Quiz1 {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(2025, 2, 26);
		MyDate date2 = new MyDate(2025, 2, 26);
		MyDate date3 = new MyDate(2025, 2, 26);
		MyDate date4 = new MyDate(2025, 2, 27);
		
		// equals의 원형은 주소를 비교하므로 false
		// 재정의된 함수는 내용을 비교하므로 true
		// 재정의된 함수가 없으면 함수의 원형을 호출한다
		System.out.println(date1.equals(date2));
		System.out.println(date3.equals(date4));
		
	}

}

class MyDate { // extends Object
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) { // 타입체크
			MyDate date = (MyDate)obj; // 다운캐스팅
			if(year == date.year && month == date.month && day == date.day) { // 나의 연도 == 비교대상의 연도
				return true;
			}
		}
		return false;
	}		
}