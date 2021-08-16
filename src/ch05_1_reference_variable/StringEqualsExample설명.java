package ch05_1_reference_variable;

public class StringEqualsExample설명 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java"; // 이러면 새로운게 데이터가 또 만들어지는게 아니라 위에 만들어진 데이터랑 같은 주소를 활용하여 저장된다.
		                      //새로운 메모리를 만드는게 아니야!!. 겹치니깐 그걸 가져다 쓰는거야 // 따라서 객체는 결국 하나야 // 메모리 절약을 할 수 있구만ㅎㅎ
		System.out.println(str1 == str2); // 둘은 현재 메모리상에서 같은 객체라는 의미

//		System.out.println(str1.hashCode()); // 주소값(매우 흡사한 숫자) 출력
//		System.out.println(str2.hashCode());

		String str3 = new String("java"); // new 키워드는 델리게이션 객체에 새로 올린다는 의미이다. //new하면 메모리를 새로 할당받아서 그것을 사용하는거
		String str4 = new String("java"); // 그러므로 둘은 다른 객체이다.
		System.out.println(str3 == str4); // 똑같은 아파트에 똑같은 동 호수에 똑같은 거닝??아니지
		System.out.println((str3.equals(str4))); // 문자열비교
		
		System.out.println(System.identityHashCode(str1)); //주소값
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		String v1 = "";   //값없이 초기화 할때 많이 쓰임
		String v2 = null; //둘이 다른거야
		System.out.println(v1);
		System.out.println(v2);
	}
}
