package ch3;

public class IfEx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = args[0];
		String res;
		// String ��ü ������ ���� ���� equals() �޼��带 ����Ѵ�.
		if (data.equals("����"))
			res = "�޴�.";
		else if (data.equals("����"))
			res = "�ÿ��ϴ�.";
		else if (data.equals("����"))
			res = "���ִ�.";
		else
			res = "��Ÿ";
		
		System.out.println(res);
	}

}
