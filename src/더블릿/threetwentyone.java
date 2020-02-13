//	프로그램 명: yaksu
//	제한시간: 1 초
//	
//	어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
//	6을 예로 들면
//	   6 ÷ 1 = 6 … 0
//	   6 ÷ 2 = 3 … 0
//	   6 ÷ 3 = 2 … 0
//	   6 ÷ 4 = 1 … 2
//	   6 ÷ 5 = 1 … 1
//	   6 ÷ 6 = 1 … 0
//	그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
//	두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오. 프로그램의 실행시간은 1초를 넘을 수 없다. 부분 점수는 없다.
//	
//	입력
//	첫째 줄에 n과 k가 빈칸을 사이에 두고 주어진다. n은 1 이상 10,000 이하이다. k는 1 이상 n 이하이다.
//	출력
//	첫째 줄에 n의 약수들 중 k번째로 작은 수를 출력한다. 만일 n의 약수의 개수가 k개보다 적어서 k번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
//	
//	입출력 예
//	입력
//	6 3
//	출력 
//	3
//	입력
//	25 4
//	출력 
//	0
//	입력 
//	2735 1
//	출력
//	1


package 더블릿;

import java.util.Scanner;

public class threetwentyone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int n = 0;
		
		for(int i = 1 ; i <= N ; i++)
		{
			if(N%i == 0)
			{
				n++;
				if(n==K)
				{
					System.out.println(i);
					break;
				}	
			}
		}
		if(n<K)
		{
			System.out.println("0");
		}
	}

}
