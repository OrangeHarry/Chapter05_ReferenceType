package ch05_2_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2��3���� ����ٴ� �ǹ�
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores [" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		System.out.println("=============================");

		int[][] englishScores = new int[2][]; //���� �ǹ̴� ���� ���� ���߿� �����ҰԿ�
		englishScores[0] = new int[2]; //���� ������ �ٷ� ���������
		englishScores[1] = new int[3]; // �̰� �� ���������� �ٸ� ���̾� �𸣰����� �׷���(����)
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores [" + i + "][" + j + "] = " + englishScores[i][j]);
			}
		}
		System.out.println("=============================");

//		int[][] javaSorces = { { 95, 80 }, { 92, 96, 80 } };
		int[][] javaSorces = {
				{95, 80},
				{92, 96, 80}
		};
		for (int i = 0; i < javaSorces.length; i++) {
			for (int j = 0; j < javaSorces[i].length; j++) {
				System.out.printf("javaSorces [%d][%d] = %d\n", i, j, javaSorces[i][j]);
			}
		}
	}
}
//������ �迭 ó�� �����Ҷ��� 0���� �����ϴ°� �ƴϳ�
//int [][] value = new int[2][3] = 2�� 3���̶�� ��
//���߿� ���� ����־ ������ 0���� �����ؼ� �ҷ����� value [0][0] ~ [1][2] 