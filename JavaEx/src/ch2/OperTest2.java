package ch2;

public class OperTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = b = 10;
		
		boolean c = ++a > b++ || a++ >= ++b;
		
		System.out.println(a + ", " + b);
		System.out.println("변수 c의 값 : " + c);
	}

}
