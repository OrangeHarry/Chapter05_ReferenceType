package ch05_2_array;

public class 확인문제4 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
//			if(array[i] > 5) {
//				max = array[i];
//			}

			if (max < array[i]) {
				max = array[i];
			}

//			max = Math.max(max, array[i]);
		}
		System.out.println("max = " + max);
	}
}
