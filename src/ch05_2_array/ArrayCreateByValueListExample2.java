package ch05_2_array;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� = " + sum1);

		System.out.println("=============================");
//�޼ҵ带 �̿��ϸ� ���� �ڵ尡 ����������
		int sum2 = add(/* 0xBC123 */new int[] { 83, 90, 87, 99, });
//                      ��ü�� ���� �ּҸ� �ҷ��� (scores1), �׷��ϱ� new�� �ٷ� ����� �� �ִ� (�翬�� ���, �����Ѿ��)   
		System.out.println("���� = " + sum2);
		System.out.println();
	}

//�޼ҵ�
	public static int add(int[] scores1) { //�� ������ �� �������!!
		int sum = 0;
		for (int i = 0; i < scores1.length; i++) {
			sum += scores1[i];
		}
		return sum;
	}
}
