package wrapper;

// 문자열 "10"을 byte, short, int, long 으로 변환
// 문자열 "10.0"을 float, double로 변환
public class Quiz1 {

	public static void main(String[] args) {
		
		byte bNum = Byte.parseByte("10");
		short sNum = Short.parseShort("10");
		int iNum = Integer.parseInt("10");
		long lNum = Long.parseLong("10");
		
		float fNum = Float.parseFloat("10.0");
		double dNum = Double.parseDouble("10.0");


	}

}
