//	프로그램 명: center1
//	제한시간: 1 초
//	
//	다음 성질을 만족할 때 n 을 중간수라 한다.
//	1 + 2 + 3 + ... + n-1 = (n+1) + (n+2) + (n+3)+ ..+ (n+m) (m은 1 이상의 자연수)
//	예를 들어 , 4 는 1+2+3=6 이고 5 부터 차례대로 더해갈 때 5+6=11 이므로 4 는 중간수가 될 수 없다.
//	6 은 1+2+3+4+5=15 이고 7+8=15 이므로 6 은 중간수이다.
//	정수 하나를 입력으로 받아 중간수 인지를 판별하는 프로그램을 작성하시오.
//	
//	입력
//	10,000 이하의 자연수가 입력으로 주어진다.
//	출력
//	중간수이면 O , 아니면 X 를 출력한다.
//	
//	입출력 예
//	입력
//	6
//	출력
//	O
//	입력
//	10
//	출력
//	X

package 더블릿;

import java.util.Scanner;

public class threetwentysix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum_1 = 0;
		int sum_2 = 0;
		
		for(int i = 1 ; i < num ; i++)
		{
			sum_1 = sum_1 + i;
		}

		for(int j = (num+1) ; j >= (num+1) ; j++)
		{
			sum_2 = sum_2 + j;
			
			if(sum_2>sum_1)
			{
				System.out.println("X");
				break;
			}
			else if(sum_2==sum_1)
			{
				System.out.println("O");
				break;
			}
		}
		
	}

}
