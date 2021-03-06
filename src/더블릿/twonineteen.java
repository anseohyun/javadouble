//	프로그램 명: whatisn
//	제한시간: 1 초
//	
//	나탈리는 손가락 세는 연습을 하고 있다.
//	먼저 아버지가 그녀에게 n (1 , 2 ... , 10) 사이 수를 말하면 그녀는 아버지에게 다시 말한다. "아버지 n 이 뭐야?" 아버지는 양 손가락의 합으로 이 수를 만든다.
//	문제를 간단히 하기 위하여 다음과 같은 규칙을 사용하는 경우 표현할 수 있는 방법은 몇가지 일까?
//	한 손 혹은 두 손을 사용할 수 있다.
//	두 손을 사용한다면 큰 수가 첫 번째에 나타나야 한다.
//	예를 들어 4 인 경우 만들 수 있는 방법은 3 가지 이다.
//	4
//	3 , 1
//	2 , 2
//	
//	입력
//	1 에서 10 사이 중 한 수가 주어진다.( 1 , 10 포함 )
//	출력
//	가짓 수를 출력한다.
//	
//	입출력 예
//	입력
//	4
//	출력
//	3

package 더블릿;

import java.util.Scanner;

public class twonineteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int right;
		int left;
		int repeat = 0;
		
		if(num <=  5)
		{
			right = 0;
			left = num - 0;
			
			for(int i = 0 ; i <= num ; i++)
			{
				
				if(right > left)
				{
					System.out.println(repeat);
					break;
				}
				right++;
				left--;
				repeat++;
			}
		}
		else
		{
			right = num - 5;
			left = 5;
			for(int i = 0 ; i <= num ; i++)
			{
				
				if(right > left)
				{
					System.out.println(repeat);
					break;
				}
				right++;
				left--;
				repeat++;
			}
		}	

	}

}
