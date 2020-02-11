//	프로그램 명: 3np1
//	제한시간: 1 초

//	정수를 입력으로 받아,
//	짝수이면 2 로 나누고 , 홀수이면 3 배해서 1 을 더함
//	1 이 될 때 까지 반복
//	6 이 입력으로 주어지면
//	6 3 10 5 16 8 4 2 1
	
//	입력
//	1000 이하의 자연수가 입력으로 주어진다.
//	출력
//	공백 한자리로 수를 구분한다.
	
//	입출력 예
	
//	입력
//	4
//	출력
//	4 2 1

package 더블릿;

import java.util.Scanner;

public class threethirteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.print(num);
		
		while(num != 1)
		{
			if(num%2 == 0)
			{
				num = num/2;
				System.out.print(" "+num);
			}
			else
			{
				num = num*3+1;
				System.out.print(" "+num);
			}
		}

	}

}
