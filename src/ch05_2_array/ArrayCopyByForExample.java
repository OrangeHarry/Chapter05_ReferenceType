package ch05_2_array;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		System.out.println(oldIntArray[0]); //
		oldIntArray[0] = 0;
		System.out.println(oldIntArray[0]); // 0���� �迭 ������ �ȵ����� �迭�ȿ� �ִ� ���� ���� �����Ѱſ��� �׷��� ���簡 �Ǵ°ǰ�...
											// �迭 ���� ��ü�� �ȵǴϱ� �� ū �迭������ ���� ���縦 ���� �ڿ����� ���ϴ� ���� �־��ָ�...���פ��� �׷��� ���°ų�
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		oldIntArray = newIntArray; // �����Ŀ� �̷��� �����ϸ� oldIntArray�ε� newIntArray�� ���� ���� ������ �� �ִ�.(�ּҰ��� ���簡 �Ǿ��ٰ� �����ϸ�
									// ����)
		oldIntArray[4] = 8;
		newIntArray[3] = 7;

		for (int i = 0; i < oldIntArray.length; i++) {
			System.out.printf("%d, ", oldIntArray[i]);
		}

		System.out.println();
		System.out.println("�迭�� ũ�� = " + oldIntArray.length);
	}
}
