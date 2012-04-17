package ch3;

public class IfEx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = args[0];
		String res;
		// String 객체 내용을 비교할 때는 equals() 메서드를 사용한다.
		if (data.equals("포도"))
			res = "달다.";
		else if (data.equals("수박"))
			res = "시원하다.";
		else if (data.equals("딸기"))
			res = "맛있다.";
		else
			res = "기타";
		
		System.out.println(res);
	}

}
