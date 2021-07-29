package ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
//			System.exit(0); //프로그램 강제종료
			return; //return의 의미를 곱씹어보자 전혀 어렵지 않아, 결국은 메인 '메소드'잖아
		}

		String strNum1 = args[0]; // 첫번째 데이터 얻기
		String strNum2 = args[1]; // 두번째 데이터 얻기

		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}
}
