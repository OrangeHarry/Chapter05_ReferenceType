package ch05_1_reference_variable;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "하헌민";
		String strVar2 = "하헌민";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("하헌민");
		String strvar4 = new String("하헌민");

		if (strVar3 == strvar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else
			System.out.println("strVar3과 strVar4는 참조가 다름");
		if (strVar3.equals(strvar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
