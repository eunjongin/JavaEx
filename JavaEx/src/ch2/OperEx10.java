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
		//s = ++a >= b ? c = " a�� ũ��" : c = " b�� ũ��";
		s += ++a >= b ? a == b ? "�� �ƴ϶� ����" : (a - b) + "��ŭ a��.." :(b - a) + "��ŭ b��..";
		System.out.println(s);
	}

}
