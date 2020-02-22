//	프로그램 명: tri
//	제한시간: 1 초
//	
//	세 정수를 입력 받아 이 수가 삼각형을 만들 수 있는지를 판단하는 프로그램을 작성하는 것이 문제이다.
//	
//	입력
//	세 양의 정수가 입력으로 주어진다. 세 수 모두 100000 이하이다.
//	출력
//	가능하면 yes , 아니면 no 를 출력한다.
//	
//	입출력 예
//	입력
//	2 3 5
//	출력
//	no
//	입력
//	4 5 6
//	출력
//	yes
//	
//	참고
//	삼각형이 이루어 지기 위해서는 제일 큰 변의 길이가 나머지 두 변의 길이의 합 보다 작아야 한다.

package 더블릿;

import java.util.Scanner;

public class twotwentyseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		int big;
		int small1;
		int small2;
		
		for(int i = 0 ; i < 3 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(arr[0] > arr[1])
		{
			if(arr[0] > arr[2])
			{
				big = arr[0];
				small1 = arr[1];
				small2 = arr[2];
			}
			else
			{
				big = arr[2];
				small1 = arr[0];
				small2 = arr[1];
			}
		}
		else
		{
			if(arr[1] > arr[2])
			{
				big = arr[1];
				small1 = arr[0];
				small2 = arr[2];
			}
			else
			{
				big = arr[2];
				small1 = arr[1];
				small2 = arr[0];
			}
		}
		

		if(big < (small1 + small2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
