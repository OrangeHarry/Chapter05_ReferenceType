package ch05_2_array;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
//		int[] scores = { 83, 90, 87 }; //�迭�� new �Ⱦ����� �� ���� ��¡
		int[] scores = new int[4]; // ���� �̸� �����ϰ� ���� ���� new�����ڸ� ���!!
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;

		System.out.println("score[0] = " + scores[0]);
		System.out.println("score[1] = " + scores[1]);
		System.out.println("score[2] = " + scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
//			sum += scores[i];
		}
		System.out.println("���� = " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� = " + avg);
	}
}
//�迭�� �����ڸ� �����ϸ� �����ϱ� ���ϴ�