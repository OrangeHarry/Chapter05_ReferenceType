package ch05_3_enumeration;

public class LoginResultExample {
	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if (result == LoginResult.SUCCESS) {

		} else if (result == LoginResult.FAIL_ID) {

		} else if (result == LoginResult.FAIL_PASSWORD) {

		}
	}
}
//머야 그냥 선언만??...