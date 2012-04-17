package ch2;

public class OperEx5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		boolean c = ((a += 12) > b) && (a == (b += 2));
		System.out.println("c = " + c);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
