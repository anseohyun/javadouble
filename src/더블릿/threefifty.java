//	프로그램 명: square
//	제한시간: 1 초
//	
//	M 과 N 이 주어질 때 M 이상 N 이하의 자연수 중 완전제곱수인 것을 모두 골라 그 합을 구하고 그 중 최소값을 찾는 프로그램을 작성하시오.
//	완전 제곱수란 어떤 자연수를 제곱해서 만들수 있는 수이다. 1*1 , 2*2 , 3*3 , 4*4 , 5*5 , ....
//	예를 들어 M = 60, N = 100 인 경우 60 이상 100 이하의 자연수 중 완전제곱수는
//	64, 81, 100
//	이렇게 총 3 개가 있으므로 그 합은 245 가 되고 이 중 최소값은 64 가 된다.
//	입력
//	첫 째 줄에 M 이, 둘째 줄에 N 이 주어진다. M 과 N 은 10000 이하의 자연수이며 M 은 N 보다 같거나 작다.
//	
//	출력
//	M 이상 N 이하의 자연수 중 완전제곱수인 것을 모두 찾아
//	첫째 줄에 그 합을,
//	둘째 줄에 그 중 최소값을 출력한다.
//	단, M 이상 N 이하의 자연수 중 완전제곱수가 없을 경우는 첫째 줄에 -1을 출력한다.
//	
//	입출력 예
//	입력
//	60 
//	100
//	출력
//	245
//	64

package 더블릿;

import java.util.Scanner;

public class threefifty {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int M = sc.nextInt();
	int N = sc.nextInt();
	int sum = 0;
	int Min = 0;
	
	for(int i = 0 ; N >= i*i ; i++)
	{
		if(i*i >= M)
		{
			sum = sum + (i*i);
			if(sum == (i*i))
			{
				Min = sum;
			}
		}
	}
	
	if(sum == 0)
	{
		System.out.println(-1);
	}
	else
	{
		System.out.println(sum);
		System.out.println(Min);
	}
		

	}

}
