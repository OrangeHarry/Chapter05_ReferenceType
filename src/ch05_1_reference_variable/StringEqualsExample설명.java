package ch05_1_reference_variable;

public class StringEqualsExample���� {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java"; // �̷��� ���ο�� �����Ͱ� �� ��������°� �ƴ϶� ���� ������� �����Ͷ� ���� �ּҸ� Ȱ���Ͽ� ����ȴ�.
		                      //���ο� �޸𸮸� ����°� �ƴϾ�!!. ��ġ�ϱ� �װ� ������ ���°ž� // ���� ��ü�� �ᱹ �ϳ��� // �޸� ������ �� �� �ֱ�������
		System.out.println(str1 == str2); // ���� ���� �޸𸮻󿡼� ���� ��ü��� �ǹ�

//		System.out.println(str1.hashCode()); // �ּҰ�(�ſ� ����� ����) ���
//		System.out.println(str2.hashCode());

		String str3 = new String("java"); // new Ű����� �������̼� ��ü�� ���� �ø��ٴ� �ǹ��̴�. //new�ϸ� �޸𸮸� ���� �Ҵ�޾Ƽ� �װ��� ����ϴ°�
		String str4 = new String("java"); // �׷��Ƿ� ���� �ٸ� ��ü�̴�.
		System.out.println(str3 == str4); // �Ȱ��� ����Ʈ�� �Ȱ��� �� ȣ���� �Ȱ��� �Ŵ�??�ƴ���
		System.out.println((str3.equals(str4))); // ���ڿ���
		
		System.out.println(System.identityHashCode(str1)); //�ּҰ�
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		String v1 = "";   //������ �ʱ�ȭ �Ҷ� ���� ����
		String v2 = null; //���� �ٸ��ž�
		System.out.println(v1);
		System.out.println(v2);
	}
}
