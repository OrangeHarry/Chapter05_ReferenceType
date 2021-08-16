package ch05_2_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 2행3열로 만든다는 의미
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores [" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		System.out.println("=============================");

		int[][] englishScores = new int[2][]; //빈값의 의미는 열의 수를 나중에 조정할게요
		englishScores[0] = new int[2]; //열의 갯수를 바로 지정해줬네
		englishScores[1] = new int[3]; // 이거 맨 위에꺼랑은 다른 값이야 모르겠으면 그려봐(쉬움)
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores [" + i + "][" + j + "] = " + englishScores[i][j]);
			}
		}
		System.out.println("=============================");

//		int[][] javaSorces = { { 95, 80 }, { 92, 96, 80 } };
		int[][] javaSorces = {
				{95, 80},
				{92, 96, 80}
		};
		for (int i = 0; i < javaSorces.length; i++) {
			for (int j = 0; j < javaSorces[i].length; j++) {
				System.out.printf("javaSorces [%d][%d] = %d\n", i, j, javaSorces[i][j]);
			}
		}
	}
}
//다차원 배열 처음 선언할때는 0부터 시작하는게 아니네
//int [][] value = new int[2][3] = 2행 3열이라는 뜻
//나중에 숫자 집어넣어서 쓸때는 0부터 시작해서 불러오기 value [0][0] ~ [1][2] 