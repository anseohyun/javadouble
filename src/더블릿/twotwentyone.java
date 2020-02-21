//	프로그램 명: coci_kornislav
//	제한시간: 1 초
//	
//	[요약] 숫자 네개가 주어질 때 네 수의 조합으로 한 방향 90 도 꺽는 동작으로 닫힌 사각형을 만들 때 이 중 최대 면적을 구하는것이 문제이다.
//	예를 들어 , 1 2 3 4 가 주어진다면 최대 면적은 3 이다.
//	
//	입출력 예
//	input 
//	1 2 3 4 
//	output 
//	3 
//	input 
//	4 4 3 4 
//	output 
//	12 

package 더블릿;

import java.util.Scanner;

public class twotwentyone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr []  = new int[4];
		
		for(int i = 0 ; i < 4 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int j = 0 ; j < 3 ; j++)
		{
			for(int i = 0 ; i < 3 ; i++)
			{
				if(arr[i] > arr[i+1])
				{
					int blank;
					blank = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = blank;
				}
			}
		}
		System.out.println(arr[0]*arr[2]);

	}

}
