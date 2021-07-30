package training;

public class ArrayMinMaXExample {
//
// int형 1차원 배열을 매개변수로 전달받아서 저장된 
// 최대값,최소값을 찾아서 반환하는 메서드를 각각 다음의 형태로 구현하세요 
// public static int minValue(int []arr) : 최소값 반환
// public static int maxValue(int []arr) : 최대값 반환
//
	public static void main(String[] args) {
//		어떤 1차원 배열을 선언하고, 구현된 메소드를 사용 해보자

		int[] arr = { 24, 61, 3, 50, 66, 17, 89, 25, 44, 33, 65, 42, };
		int[] myMinde = { 45, 88, 99, 65, 24, 75, 5, 67, 22, 98, 25, 43, 1, 55, 69, 87 };

		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));

		System.out.println(maxValue(myMinde));
		System.out.println(minValue(myMinde));
	}

	public static int maxValue(int[] ar) { // 왜 arr이 아닌 ar로 해도 되는거지?? 아 어차피 다른 메소드라 하나 생성을 해준거구나, ar로 다른 배열 필드를 받아아라?
//		int max = 0; //0으로 초기화 하면 음수 들만 있을때 최댓값이 아닌 그냥 0만 찍힌다.
//		int max = Integer.MIN_VALUE; //인텐져 함수를 이용, (정수로 표현할 수 있는 가장 작은값!!)
		int max = ar[0]; // 여기서는 이게 가장 정확하다. 어차피 배열 첫번쨰 값부터 시작해서 비교를 하면 되니깐
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i]; // 삼항연산자로도 할 수 있네
			}
		}
		return max;
	}

	public static int minValue(int[] arrr) {// 메인 메소드 arr이랑 다른 객체야!! 그냥 변수는 아무거나 써도 되네
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
