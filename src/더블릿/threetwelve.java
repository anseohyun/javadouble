//	프로그램 명: sb
//	제한시간: 1 초
	
//	딸기 농가 경제가 좋아져서 , 가장 부지런한 농부 한 명에게 보너스를 지급하기로 했습니다.
//	농부 7 명 , 각 농부별로 수확한 딸기 바구니의 수를 입력 받아서 가장 부지런한 농부 번호를 출력하는 프로그램을 작성하세요.
	
//	입력
//	7 명의 농부가 수확한 딸기 바구니 수가 입력으로 주어진다. 각 수는 100 이하의 자연수이고 같은 수는 입력으로 주어지지 않는다.
//	입력되는 순서대로 1 번농부 , 2 번 , 3 번 ...
//	출력
//	가장 부지런한 농부 번호를 출력한다.
	
//	입출력 예
	
//	입력
//	6 2 9 8 1 4 7
//	출력
//	3

package 더블릿;

import java.util.Scanner;

public class threetwelve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[7];
		int best;
		int best_num = 1;
		
		for(int i = 0 ; i<7;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		best = arr[0];
		
		int j;
		
		for(j = 1 ; j<=7 ; j++)
		{
			if(best < arr[j-1])
			{
				best = arr[j-1];
				best_num = j;
			}
		}
		
		System.out.println(best_num);

	}

}
