package ch3;

public class IfEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 51;
		//String str;
		String str = "50미만"; // String str; 이렇게 하면 오류가 발생한다.
		
		if (su1 >= 50)
			str = "50이상";
		
		System.out.println(str + "입니다.");
	}

}
