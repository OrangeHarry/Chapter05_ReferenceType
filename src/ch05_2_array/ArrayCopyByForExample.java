package ch05_2_array;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		System.out.println(oldIntArray[0]); //
		oldIntArray[0] = 0;
		System.out.println(oldIntArray[0]); // 0뭐야 배열 수정은 안되지만 배열안에 있는 값은 변경 가능한거였네 그래서 복사가 되는건가...
											// 배열 수정 자체가 안되니깐 더 큰 배열구조를 만들어서 복사를 한후 뒤에값에 원하는 값을 넣어주면...좋네ㅎㅎ 그래서 쓰는거네
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		oldIntArray = newIntArray; // 복사후에 이렇게 선언하면 oldIntArray로도 newIntArray의 뒤이 값을 생성할 수 있다.(주소값이 복사가 되었다고 생각하면
									// 좋다)
		oldIntArray[4] = 8;
		newIntArray[3] = 7;

		for (int i = 0; i < oldIntArray.length; i++) {
			System.out.printf("%d, ", oldIntArray[i]);
		}

		System.out.println();
		System.out.println("배열의 크기 = " + oldIntArray.length);
	}
}
