//	프로그램 명: min
//	제한시간: 1 초
//
//	7 개의 수를 입력으로 받아 입력 받은 수 중 최소값을 출력하는 프로그램을 작성하시오.
//
//	입력
//	7 개의 수는 100 이하의 자연수이다.
//	출력
//	최소값
//
//	입출력 예
//	입력
//	6 2 9 8 3 4 7
//	출력
//	2

package 더블릿;

import java.util.Scanner;

public class threeten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0 ; i < 7 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		int min = arr[0];
		
		for(int j = 1; j < 7 ; j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
		}
		
		System.out.println(min);

	}

}
