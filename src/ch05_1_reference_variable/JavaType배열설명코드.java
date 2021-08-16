package ch05_1_reference_variable;

public class JavaType배열설명코드 {
	public static void main(String[] args) {
		int iv = 10;
		double dv = 10.0;

		System.out.println(iv);
		System.out.println(dv);

		// 1차원 배열 생성
		int[] ar0 = new int[2];
		int[] ar1 = new int[3];
		ar1[2] = 3;
		int[] ar2 = new int[2];
		ar2[0] = 4;

		System.out.println(ar0);
		System.out.println(ar1);
		System.out.println(ar2);

		// int형 1차원 배열을 갖는 배열3개짜리 2차원배열 생성
		int[][] arrs = new int[3][];
		arrs[0] = ar0;
		arrs[1] = ar1;
		arrs[2] = ar2;
//		int[][] arrs = { ar0, ar1, ar2 }; //위에꺼랑 같은거

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] +", ");
			}
		}
		System.out.println();
		for(int[] elements : arrs) {
			for (int e : elements) {
				System.out.print(e + ", ");
			}
		}
	}
}
