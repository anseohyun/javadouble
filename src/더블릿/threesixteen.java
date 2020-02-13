//	프로그램 명: Nsum(open)
//	제한시간: 1 초
//	
//	N 이 주어질 때, 1+2+…+(N-1)+N 을 더하면 M 을 만들 수 있다. M 이 주어질 때, N 을 구하여라.
//	
//	입력
//	첫째 줄에 1~N 의 합 M 이 입력된다. 답을 구할수 없는 경우는 입력으로 주어지지 않는다.
//	출력
//	첫째 줄에 N 을 출력한다. N 은 커야 100 을 넘지 않는다.
//	
//	입출력 예
//	입력
//	45
//	출력
//	9

package 더블릿;

import java.util.Scanner;

public class threesixteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int i;
		
		for(i = 1 ; true ; i++)
		{
			sum = sum - i;
			if(sum==0)
			{
				System.out.println(i);
				break;
			}
			else if(sum<0)
			{
				break;
			}
		}

	}

}
