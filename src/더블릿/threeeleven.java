// 최대 최소 출력하기
//	7 개의 수를 입력으로 받아 입력 받은 수 중 최대값,최소값을 출력하는 프로그램을 작성하시오.
//
//	입력
//	7 개의 수는 100 이하의 자연수이다.
//	출력
//	두 수를 출력한다. 첫 수는 최대 , 두 번째수는 최소값이다.

//	입출력 예

//	입력
//	6 2 9 8 3 4 7
//	출력
//	9 2

package 더블릿;

import java.util.Scanner;

public class threeeleven {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int arr []  = new int[7];
	for(int i = 0; i<7;i++)
	{
		arr[i] = sc.nextInt();
	}
	
	
	int max = arr[0];
	for(int p = 0; p<6; p++)
	{
		if(max < arr[p+1])
		{
			max = arr[p+1];
		}
	}
	
	int min = arr[0];	
	for(int j = 0; j<6;j++)
	{
		if(min > arr[j+1])
		{
			min = arr[j+1];
		}
	}
	
	System.out.println(max + " "+ min);
	
	}
}
