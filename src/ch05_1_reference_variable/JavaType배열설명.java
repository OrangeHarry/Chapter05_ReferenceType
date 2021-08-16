package ch05_1_reference_variable;

public class JavaType배열설명 {
	public static void main(String[] args) {
		String[][][][][][] 대한민국;
//[0]		서울 부산 대구..
//[1]		강남구 강서구 등등..
//[2]		당산동 역삼동...
//[3]		푸르지오, 지웰시티...
//[4]		101동 102동..
//[5]		101호 102호..   // 각각으로 보면 전부 다 1차원 배열이다  
//		 이런식으로 배열을 이해하면 좀 더 편할 것이다
		
		int i =33;
		System.out.println(i); // 33
		
		String[] strs = {"korea", "fighting"};
		System.out.println(strs); // 주소를 나타낸다고 생각하면 된다.(자바에 정확한 주소를 알려주는건 없긴 하다)
		System.out.println(strs[0]);
	}
}
//배열의 첫번째 []는 그 배열 부분에 대한 주소값이다.

//주소값을 던져주고(new) .을찍고 나머지값들을 사용하게 한다.

/* 개체
 *  변수와타입..
 */

/*객체  
 *   클래스 -> 구조체(데이터 + 기능 등등)  "캡슐화"
 */
