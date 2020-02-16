//	
//	프로그램 명: perfect
//	
//	제한시간: 1 초
//	완전수(perfect) , 부족수(deficient) , 과잉수(abundant) 를 출력하는 문제.
//	완전수란 자신을 제외한 약수의 합이 자신과 같은 수 , 부족수는 합이 자신의 수보다 작은수 , 과잉수는 큰수
//	
//	입력
//	각 수는 60,000 보다 작다.
//	출력
//	수는 5 자리 확보후 오른쪽에 맞추어 출력후 2 칸 스페이스를 준 후 수의 종류를 출력한다.
//	
//	입출력 예
//	입력
//	15
//	출력
//       15  DEFICIENT
//	입력
//	28
//	출력
//	     28  PERFECT
//	입력
//	56
//	출력
//	     56  ABUNDANT

package 더블릿;

import java.util.Scanner;

public class threetwentyfour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		String result_num = String.format("%5d", num);
		
		for(int i = 1;i < num;i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}

		if(sum == num)
		{
			System.out.println(result_num+"  "+"PERFECT");
		}
		else if(sum<num)
		{
			System.out.println(result_num+"  "+"DEFICIENT");
		}
		else
		{
			System.out.println(result_num+"  "+"ABUNDANT");
		}
	}

}
