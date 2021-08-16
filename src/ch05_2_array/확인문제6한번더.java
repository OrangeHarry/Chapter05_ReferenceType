package ch05_2_array;

import java.util.Scanner;

public class 확인문제6한번더 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int inputData = 0;
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println(" 1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			System.out.printf("선택> ");
			inputData = Integer.parseInt(scanner.nextLine());
			
			if(inputData == 1) {
				System.out.printf("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			}else if(inputData == 2) {
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] " , i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(inputData == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
			}else if(inputData == 4) {
				int max = 0;
				int sum = 0;
				for (int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				double avg = (double)sum / studentNum;
				System.out.println("최고 점수 = " + max);
				System.out.println("평균 점수 = " +avg );
			}else if(inputData == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
