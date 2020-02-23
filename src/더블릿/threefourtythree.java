//	프로그램 명: rprime
//	제한시간: 1 초
//	
//	두 수가 서로 소(relatively prime)
//	두 수의 공약수가 1 만이 존재하는 수 즉 최대 공약수가 1 인 수
//	서로 소인 예를 들면
//	4 와 9 , 5 와 8 , 8 과 9 ...
//	
//	입력
//	두 수가 입력으로 주어진다. 두 수는 1000 이하의 자연수이다.
//	출력
//	서로 소이면 yes 아니면 no 를 출력한다.
//	
//	입출력 예
//	입력
//	4 9
//	출력
//	yes
//	입력
//	4 7
//	출력
//	yes
//	입력
//	6 8
//	출력
//	no

package 더블릿;

import java.util.Scanner;

public class threefourtythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int small;
		int check = 0;
		
		if(num1 >= num2)
		{
			small = num2;
		}
		else
		{
			small = num1;
		}
		
		for(int i = 2 ; i <= small ; i++)
		{
			if(num1 % i == 0)
			{
				if(num2 % i == 0)
				{
					check++;
					System.out.println("no");
					break;
				}
			}
		}
		
		if(check == 0)
		{
			System.out.println("yes");
		}
			

	}

}
