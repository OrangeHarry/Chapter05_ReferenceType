package ch05_2_array;

import java.util.Scanner;

public class Ȯ�ι���6�ѹ��� {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int inputData = 0;
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println(" 1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("----------------------------------------------------");
			System.out.printf("����> ");
			inputData = Integer.parseInt(scanner.nextLine());
			
			if(inputData == 1) {
				System.out.printf("�л���> ");
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
				System.out.println("�ְ� ���� = " + max);
				System.out.println("��� ���� = " +avg );
			}else if(inputData == 5){
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
