//	프로그램 명: oddddo(open)
//	제한시간: 1 초
//	
//	주희는 심심해서 종이에 1 부터 홀수를 차례로 어떤 수까지 적었다. 다음 줄에는 이 적힌 수를 거꾸로 적은 후 아랫수와 윗수의 곱의 합이 얼마일까가 궁금해 졌다.
//	3 개의 수를 적었다면
//	1 3 5
//	5 3 1
//	------
//	5 9 5
//	합은 19 이다.
//	주희를 도와 이 문제를 풀어라.
//	
//	입력
//	자연수 N 이 입력으로 주어진다. N 은 쓴 수의 개수이다. 1000 을 넘지 않는다.
//	출력
//	합을 출력한다.
//	
//	입출력 예
//	입력
//	3
//	출력
//	19

package 더블릿;

import java.util.Scanner;

public class threethirtynine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		arr[0] = 1;
		
		for(int i = 0 ; i < (num-1) ; i++)
		{
			arr[i+1] = arr[i] + 2;
		}
		
		int j = num - 1;
		for(int i = 0 ; i < num ; i++)
		{
			sum = sum + arr[i] * arr[j];
			j--;
		}
				
		System.out.println(sum);

	}

}
