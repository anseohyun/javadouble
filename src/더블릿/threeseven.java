//	프로그램 명: adigit
//	제한시간: 1 초
//	
//	한 자리 정수는 한자리수 끼리의 합 , 두 자리 정수는 두자리 정수 , 세 자리 정수는 세자리 정수의 합을 구하는 문제이다.
//	
//	입력
//	입력은 7 개 이고 , 각 수는 999 이하의 양의 정수이다.
//	출력
//	세 수가 출력된다. 각각 한자리 정수,두자리 정수,세자리 정수끼리의 합이다.
//	
//	입출력 예
//	입력
//	1 10 100 2 20 300 1
//	출력
//	4 30 400

package 더블릿;

import java.util.Scanner;

public class threeseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0 ; i<7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int num0 = 0;
		int num00 = 0;
		int num000 = 0;
		
		for(int j = 0; j < 7 ; j++)
		{
			if(arr[j] < 10)
			{
				num0 = num0 + arr[j];
			}
			else if(arr[j] < 100)
			{
				num00 = num00 + arr[j];	
			}
			else if(arr[j] < 1000)
			{
				num000 = num000 + arr[j];
			}
	
		}
	
		System.out.println(num0 + " " + num00 + " " + num000);
	}
}
