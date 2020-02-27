//	프로그램 명: fou(open,special judge)
//	제한시간: 1 초
//	
//	등차 수열을 이루는 네 수가 주어진다. 그런데 네 수 중 한 수를 잊어 버렸다. 이 수를 구하는 게 문제이다.
//	답은 유일하지 않을 수 있지만 존재 한다는 것은 보장 된다.
//	
//	입력
//	세 수가 입력으로 주어진다. 세 수는 -100 이상 100 이하의 수이다.
//	출력
//	잊어 버린 한 수를 출력 한다.
//	
//	입출력 예
//	입력
//	4 6 8 
//	출력
//	10
//	입력
//	10 1 4 
//	출력
//	7

package 더블릿;

import java.util.Scanner;

public class threefourtyfive {

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
				if(arr[j+1] < arr[j])
				{
					int a;
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		
		if(arr[2] - arr[1] == arr[1] - arr[0])
		{
			System.out.println(arr[2]+(arr[1] - arr[0]));
		}
		else if((arr[2] - arr[1]) > (arr[1] - arr[0]))
		{
			System.out.println(arr[2] - (arr[1] - arr[0]));
		}
		else
		{
			System.out.println(arr[1] - (arr[2] - arr[1]));
		}
		
	}

}
