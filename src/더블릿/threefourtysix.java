//	프로그램 명: bit_pos
//	제한시간: 1 초
//	
//	양의 정수 n 을 입력으로 받아 이 수를 이진수로 나타내었을 때 1 이 나타나는 위치를 구하는 것이 문제이다.
//	수를 이진수로 나타내었을 때 가장 오른쪽의 자리를 LSB(Least Significant Bit)라 한다. LSB 를 0 번 위치로 간주한다.
//	
//	입력
//	양의 정수 n 이 입력으로 주어진다. ( 1 <= n <= 10^6 )
//	출력
//	1 이 나타나는 위치를 모두 출력한다.
//	
//	입출력 예
//	입력
//	13
//	출력
//	0 2 3

package 더블릿;

import java.util.Scanner;

public class threefourtysix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = num;
		int i = -1;
		int rest = 0;

		while(n != 0 && n != 1)
		{
			rest = n%2;
			n = n/2;
			i++;
//			System.out.println(i);
//			System.out.println(n);
//			System.out.println(rest);
//			System.out.println();
			
			if(rest == 1)
			{
				System.out.print(i + " ");
//				System.out.println();		
			}
			
		}
		if(n == 1)
		{
			System.out.print(i+1);
		}
		

	}

}
