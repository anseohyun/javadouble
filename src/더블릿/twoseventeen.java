//	프로그램 명: med
//	제한시간: 1 초
//	
//	세 정수를 입력으로 받아 이 수를 크기 순으로 나열할 때 중간에 위치한 수(중위수)를 구하는 문제이다.
//	입력
//	1000 이하의 자연수가 입력으로 주어진다. 세 수는 모두 같을 수 도 있다.
//	출력
//	
//	입출력 예
//	입력
//	1 5 2
//	출력
//	2
//	입력
//	2 2 2
//	출력
//	2
//	입력 
//	2 5 2
//	출력
//	2

package 더블릿;

import java.util.Scanner;

public class twoseventeen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		for(int i = 0 ; i < 3 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int blank;
					blank = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = blank;
				}
			}
		}
		
		System.out.println(arr[1]);
		
	}
}
