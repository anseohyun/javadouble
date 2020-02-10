//	프로그램 명: sum
//	제한시간: 1 초

//	7 개의 자연수를 입력으로 받아 이 수들의 합을 구하는 프로그램을 작성하시오.

//	입력
//	7 개의 수가 입력으로 주어진다.
//	각 수는 100 이하의 자연수이다.
//	출력
//	수들의 합

//	입출력 예
//
//	입력
//	6 2 9 8 3 4 7
//	출력
//	39

package 더블릿;

import java.util.Scanner;

public class threefive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0; i<7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int j = 0; j<7 ;j++)
		{
			sum = sum + arr[j];
		}
		
		System.out.println(sum);

	}

}
