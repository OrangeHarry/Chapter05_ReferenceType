package ch05_2_array;

public class MainStringArrayArgument���� { // args = {"kor" , "v1.01"}; 
	public static void main(String[] args) {
//		���� �� Ư�� ���ǿ� ���� ������ ����ϰ� ������...
		String version = "";
		if (args != null) {
			version = args[0];
			if (version.equals("kor")) {
				System.out.println("�ȳ��ϼ��� " + args[1]);//args[1] = �ּҰ��� �����°ž�!!
			} else {
				System.out.println("Hello " + args[1]);
			}
		}
	}
}
//cmd�� �����غ�
//���� ��Ŭ������ �����ϸ� �׳� �ƹ� ���� ���� ��Ȳ���ڳ�
//Run -> Run Configuration -> �ش�Ŭ���� -> Argument -> ���Է�
//���� ��Ŭ���������� ����