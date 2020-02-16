//	프로그램 명: ft
//	제한시간: 1 초
//	
//	자연수가 입력으로 주어진다. 이 수의 약수를 출력하고 , 다음 줄에는 약수의 개수 , 
//	다음 줄에는 약수의 총합 , 다음 줄에는 약수의 곱의 일의 자리수를 출력한다.
//	
//	입력
//	주어지는 수는 1000 이하의 자연수이다.
//	출력
//	
//	입출력 예
//	입력
//	6
//	출력
//	1 2 3 6
//	4
//	12
//	6

package 더블릿;

import java.util.Scanner;

public class threetwentytwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 0;
		int sum = 0;
		long time = 1;
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(n%i == 0)
			{
				System.out.print(i + " ");
				num++;
				sum = sum + i;
				time = time * i%10;
			}
			
		}
		
		System.out.println();
		System.out.println(num);
		System.out.println(sum);
		System.out.println(time);
	}
}
