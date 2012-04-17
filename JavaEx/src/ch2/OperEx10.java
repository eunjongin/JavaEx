package ch2;

public class OperEx10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 15;
		String s = " ";
		//String s;
		//s = ++a >= b ? c = " a가 크다" : c = " b가 크다";
		s += ++a >= b ? a == b ? "가 아니라 같네" : (a - b) + "만큼 a가.." :(b - a) + "만큼 b가..";
		System.out.println(s);
	}

}
