package ch3;

public class SwitchEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		String res;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = "30";
				break;
			case 2:
				res = "29";
				break;
			default:
				res = "����";
		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");
	}

}
