package ch05_2_array;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","arrat","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
	}
}
