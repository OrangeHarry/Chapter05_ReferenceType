package ch05_2_array;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 = " + sum1);

		System.out.println("=============================");
//메소드를 이용하면 실행 코드가 간결해진다
		int sum2 = add(/* 0xBC123 */new int[] { 83, 90, 87, 99, });
//                      객체의 시작 주소를 불러옴 (scores1), 그러니깐 new를 바로 사용할 수 있다 (당연한 얘기, 간단한얘기)   
		System.out.println("총합 = " + sum2);
		System.out.println();
	}

//메소드
	public static int add(int[] scores1) { //이 구조를 잘 기억하자!!
		int sum = 0;
		for (int i = 0; i < scores1.length; i++) {
			sum += scores1[i];
		}
		return sum;
	}
}
