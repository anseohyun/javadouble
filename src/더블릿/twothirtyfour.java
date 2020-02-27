//	프로그램 명: cross(open)
//	제한시간: 1 초
//	
//	원을 가로 지르는 선분을 현이라 한다.
//	원에는 1 부터 100 까지 일정한 간격으로 점이 부여되어 있다.
//	두 개의 현이 주어질 때 이 현이 교차하는지 아닌지를 판단하는 프로그램을 작성하시오.
//	아래 그림은 두 현이 교차하는 경우의 예이다.
//	
//	입력 형식
//	첫 줄에는 한 현의 정보가 다음 줄에는 다른 한 현의 정보가 입력된다. 숫자는 1 이상 100 이하인 서로 다른 자연수이다.
//	출력 형식
//	두 현이 교차하면 cross ,아니면 not cross 를 출력한다.
//	
//	입출력 예
//	입력 
//	20 80
//	85 40
//	출력 
//	cross

package 더블릿;

import java.util.Scanner;

public class twothirtyfour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[2];
		int arr2[] = new int[2];
		int big1, big2, small1, small2;
		
		
		for(int i = 0 ; i < 2 ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 2 ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		
		if(arr1[0] > arr1[1])
		{
			big1 = arr1[0];
			small1 = arr1[1];
		}
		else
		{
			big1 = arr1[1];
			small1 = arr1[0];
		}
		if(arr2[0] > arr2[1])
		{
			big2 = arr2[0];
			small2 = arr2[1];
		}
		else
		{
			big2 = arr2[1];
			small2 = arr2[0];
		}
		
		
		
		if(small1 > big2 || small2 > big1)
		{
			System.out.println("not cross");
		}
		else
		{
			if(big1 > big2)
			{
				if(small1 > small2)
				{
					System.out.println("cross");
				}
				else
				{
					System.out.println("not cross");
				}
			}
			else
			{
				if(small1 < small2)
				{
					System.out.println("cross");
				}
				else
				{
					System.out.println("not cross");
				}
			}
		}

	}

}
