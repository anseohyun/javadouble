//	프로그램 명: tf
//	제한시간: 1 초
//	
//	양의 정수 n 을 입력으로 받아 n = o * 2^p 가 되는 홀수 o 와 정수 p 를 구하는 것이 문제이다.
//	예를 들어 24 를 입력으로 받으면 o = 3 , p = 3 이다.
//	
//	입력
//	정수 n 이 입력으로 주어진다. ( 1 <= n <= 10^6 )
//	출력
//	한 줄에 o 와 p 를 출력한다.
//	
//	입출력 예
//	입력
//	24
//	출력
//	3 3

package 더블릿;

import java.util.Scanner;

public class threefourtyfour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int o;
		int p = 1;
		int P = 0;
		
		if(n == 1)
		{
			System.out.println(1 + " " + 0);
		}
		else
		{
			while(n > p)
			{
				p = p*2;
				P++;
				if(n%p == 0)
				{
					if((n/p)%2 == 1)
					{
						o = n/p;
						System.out.println(o + " " + P);
						break;
					}
				}
				else
				{
					System.out.println(n + " " + 0);
					break;
				}
			}
		}

	}

}
