//	프로그램 명: gcd_lcm
//	제한시간: 1 초
//	
//	두 수의 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//	
//	입력
//	1000 이하의 자연수를 입력으로 받는다.
//	출력
//	한 줄에 두 수를 출력한다. 첫번째 수는 최대 공약수이고 , 다음 수는 최소 공배수이다.
//	
//	입출력 예
//	입력
//	4 6
//	출력
//	2 12

package 더블릿;

import java.util.Scanner;

public class threefourty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int big;
		int small;
		int max = 0;
		
		
		if(num1 > num2)
		{
			big = num1;
			small = num2;
			
		}
		else
		{
			big = num2;
			small = num1;
		}
				
		for(int i = 1 ; i <= big ; i++)
		{
			if(num1 % i == 0)
			{
				if(num2 % i == 0)
				{
					if(max < i)
					{
						max = i;
					}
				}
			}
		}
		
		System.out.print(max + " ");
		
		int min = big*small;
		
		for(int i = 1 ; min > big*i ; i++)
		{
			for(int j = 1 ; big*i >= small*j ; j++)
			{
				if(big*i == small*j)
				{
					if(min > big*i)
					{
						min = big*i;
					}
				}
			}
		}
		
		System.out.print(min);
		
		

	}

}
