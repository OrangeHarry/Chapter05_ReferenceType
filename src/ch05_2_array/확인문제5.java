package ch05_2_array;

public class 확인문제5 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		int count = 0; //변수를 새로 하나 만들어서 최대행의 숫자를 보자
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				sum = sum + array[i][j];
				sum += array[i][j];
				count++; //이러면 얘가 최대치까지 올라가잖아
			}
		}
//		avg = (double) sum / 10;
		avg = (double) sum / count;

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}
}
