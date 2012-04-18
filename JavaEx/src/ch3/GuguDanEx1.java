package ch3;

public class GuguDanEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = Integer.parseInt(args[0]);
		System.out.println(dan + "´Ü");
		System.out.println("---------------");
		for (int i = 1; i <= 9; i++)
			System.out.println(dan + " * " + i + " = " + (dan * i));
	}

}
