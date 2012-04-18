package ch3;

public class MultiForEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 65;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(ch++ + " ");
			System.out.println();
		}
	}

}
