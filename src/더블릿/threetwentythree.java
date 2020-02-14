//	프로그램 명: complete
//	제한시간: 1 초
//	
//	완전수란 자신을 제외한 약수의 합이 자신이 되는 수를 완전수라 한다.
//	6 은 완전수이다. 6 의 약수는
//	1 2 3 6
//	이 중 자신을 제외한 약수의 합 1 + 2 + 3 = 6 즉 6 은 완전수이다.
//	
//	입력
//	1000 이하의 자연수를 입력받는다.
//	출력
//	완전수이면 yes , 아니면 no 를 출력한다.
//	
//	입출력 예
//	입력
//	6
//	출력
//	yes
//	입력
//	8
//	출력
//	no

package 더블릿;

import java.util.Scanner;

public class threetwentythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i < num ; i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}