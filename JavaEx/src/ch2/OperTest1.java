package ch2;

public class OperTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(++a);
		
		System.out.println(++a + b++);
		
		System.out.println((++a % 3) + (a * ++b));
	}

}
