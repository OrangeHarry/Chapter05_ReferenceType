package ch05_2_array;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
//		int[] scores = { 83, 90, 87 }; //배열은 new 안쓰고도 쓸 수가 있징
		int[] scores = new int[4]; // 값을 미리 배정하고 싶을 때는 new연산자를 사용!!
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
		System.out.println("총합 = " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 = " + avg);
	}
}
//배열은 눈금자를 생각하면 이해하기 편하다
