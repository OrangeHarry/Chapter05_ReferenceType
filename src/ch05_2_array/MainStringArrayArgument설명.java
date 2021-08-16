package ch05_2_array;

public class MainStringArrayArgument설명 { // args = {"kor" , "v1.01"}; 
	public static void main(String[] args) {
//		실행 시 특정 조건에 따른 실행을 명령하고 싶을때...
		String version = "";
		if (args != null) {
			version = args[0];
			if (version.equals("kor")) {
				System.out.println("안녕하세요 " + args[1]);//args[1] = 주소값을 가져온거야!!
			} else {
				System.out.println("Hello " + args[1]);
			}
		}
	}
}
//cmd로 실행해봐
//현재 이클립스로 실행하면 그냥 아무 값이 없는 상황이자나
//Run -> Run Configuration -> 해당클래스 -> Argument -> 값입력
//이젠 이클립스에서도 가능