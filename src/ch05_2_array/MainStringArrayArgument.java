package ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("���� ���� �����մϴ�.");
//			System.exit(0); //���α׷� ��������
			return; //return�� �ǹ̸� ���þ�� ���� ����� �ʾ�, �ᱹ�� ���� '�޼ҵ�'�ݾ�
		}

		String strNum1 = args[0]; // ù��° ������ ���
		String strNum2 = args[1]; // �ι�° ������ ���

		int num1 = Integer.parseInt(strNum1); // ���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}
}
