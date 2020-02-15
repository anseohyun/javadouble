//	프로그램 명: validate
//	제한시간: 1 초
//	
//	컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
//	고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
//	검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
//	예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
//	고유번호의 처음 5자리의 숫자들을 입력 받아 검증수를 계산하는 프로그램을 작성하시오.
//	프로그램의 실행시간은 1초를 넘을 수 없다. 부분 점수는 없다.
//	
//	입력
//	첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
//	출력
//	첫째 줄에 검증수를 출력한다.
//	
//	입출력 예
//	입력
//	0 4 2 5 6
//	출력
//	1

package 더블릿;

import java.util.Scanner;

public class threetwentyfive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0 ; j < arr.length ; j++)
		{
			sum = sum + arr[j]*arr[j];
		}
		
		System.out.println(sum%10);

	}

}
