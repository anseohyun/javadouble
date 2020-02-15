//	프로그램 명: even_odd(open)
//	제한시간: 1 초
//	짝,홀수성을 공부 중인 주희는
//	덧셈에서는 짝수(even)끼리 , 홀수(odd)끼리의 합은 짝수이고 , 짝/홀수가 섞여 있는 경우 홀수가 된다는 것을 ,
//	곱셈에서는 곱하는 두 수 중 짝수가 하나라도 있는 경우에는 짝수가 된다는 것을 알았다.
//	이를 컴퓨터로 확인 해 보기로 했다.
//	
//	입력
//	1000 이하의 두 자연수가 입력으로 주어진다.
//	출력
//	공백없이 출력 예의 형식으로 출력한다.
//	
//	입출력 예
//	입력
//	5 8
//	출력
//	odd+even=odd
//	odd*even=even
//	입력
//	8 5
//	출력
//	even+odd=odd
//	even*odd=even
//	입력
//	5 3
//	출력
//	odd+odd=even
//	odd*odd=odd

package 더블릿;

import java.util.Scanner;

public class twowixteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		String num1;
		String num2;
		
		if(num_1%2==0)
		{
			num1 = "even";
		}
		else
		{
			num1 = "odd";
		}
		if(num_2%2==0)
		{
			num2 = "even";
		}
		else
		{
			num2 = "odd";
		}
		
		if((num_1+num_2)%2 == 0)
		{
			System.out.println(num1+"+"+num2+"="+"even");
		}
		else
		{
			System.out.println(num1+"+"+num2+"="+"odd");
		}
		
		if((num_1*num_2)%2 == 0)
		{
			System.out.println(num1+"*"+num2+"="+"even");
		}
		else
		{
			System.out.println(num1+"*"+num2+"="+"odd");
		}

	}

}
