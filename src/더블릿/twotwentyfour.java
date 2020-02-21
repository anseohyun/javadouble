//	프로그램 명: fourth
//	제한시간: 1 초
//	
//	주희는 축에 평행 한 직사각형을 만들기 위해 3 점을 선택 후 네 번째 점을 구하는데 고생을 하고 있다.
//	주희를 도와 네 번째 점을 구하라.
//	
//	입력
//	1 에서 1000 이하의 정수 3 쌍이 입력으로 주어진다.
//	출력
//	네 번째 점을 구하라.
//	
//	입출력 예
//	입력
//	5 5
//	5 7
//	7 5
//	출력
//	7 7
//	입력
//	30 20
//	10 10
//	10 20
//	출력
//	30 10

package 더블릿;

import java.util.Scanner;

public class twotwentyfour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[3];
		int y[] = new int[3];
		
		for(int i = 0 ; i < 3 ; i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		if(x[0] == x[1])
		{
			System.out.print(x[2] + " ");
		}
		else
		{
			if(x[0] == x[2])
			{
				System.out.print(x[1] + " ");
			}
			else
			{
				System.out.print(x[0] + " ");
			}
		}

		if(y[0] == y[1])
		{
			System.out.println(y[2]);
		}
		else
		{
			if(y[0] == y[2])
			{
				System.out.println(y[1]);
			}
			else
			{
				System.out.println(y[0]);
			}
		}
	}

}
