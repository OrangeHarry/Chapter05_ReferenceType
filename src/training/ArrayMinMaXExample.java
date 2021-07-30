package training;

public class ArrayMinMaXExample {
//
// int�� 1���� �迭�� �Ű������� ���޹޾Ƽ� ����� 
// �ִ밪,�ּҰ��� ã�Ƽ� ��ȯ�ϴ� �޼��带 ���� ������ ���·� �����ϼ��� 
// public static int minValue(int []arr) : �ּҰ� ��ȯ
// public static int maxValue(int []arr) : �ִ밪 ��ȯ
//
	public static void main(String[] args) {
//		� 1���� �迭�� �����ϰ�, ������ �޼ҵ带 ��� �غ���

		int[] arr = { 24, 61, 3, 50, 66, 17, 89, 25, 44, 33, 65, 42, };
		int[] myMinde = { 45, 88, 99, 65, 24, 75, 5, 67, 22, 98, 25, 43, 1, 55, 69, 87 };

		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));

		System.out.println(maxValue(myMinde));
		System.out.println(minValue(myMinde));
	}

	public static int maxValue(int[] ar) { // �� arr�� �ƴ� ar�� �ص� �Ǵ°���?? �� ������ �ٸ� �޼ҵ�� �ϳ� ������ ���ذű���, ar�� �ٸ� �迭 �ʵ带 �޾ƾƶ�?
//		int max = 0; //0���� �ʱ�ȭ �ϸ� ���� �鸸 ������ �ִ��� �ƴ� �׳� 0�� ������.
//		int max = Integer.MIN_VALUE; //������ �Լ��� �̿�, (������ ǥ���� �� �ִ� ���� ������!!)
		int max = ar[0]; // ���⼭�� �̰� ���� ��Ȯ�ϴ�. ������ �迭 ù���� ������ �����ؼ� �񱳸� �ϸ� �Ǵϱ�
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i]; // ���׿����ڷε� �� �� �ֳ�
			}
		}
		return max;
	}

	public static int minValue(int[] arrr) {// ���� �޼ҵ� arr�̶� �ٸ� ��ü��!! �׳� ������ �ƹ��ų� �ᵵ �ǳ�
		int min = maxValue(arrr);
//		int min = arrr[0];
		for (int i = 0; i < arrr.length; i++) {
//			if (min > arrr[i]) {
//				min = arrr[i];
//			}
			min = (min > arrr[i]) ? arrr[i] : min;
		}
		return min;
	}
}
