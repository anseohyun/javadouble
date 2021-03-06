//	프로그램 명: selfdup
//	제한시간: 1 초
//	
//	어떤 자연수 N 을 제곱했을 때, 그 제곱수의 맨 뒷자리에 원래의 수 N이 다시 나타나면, 우리는 그 수 N을 자기복제수라고 하자.
//	예를 들면, 5의 제곱은 25이고 25의 맨 뒷자리에 원래의 수 5가 나타나기 때문에 자기복제수가 된다. 또 다른 예로, 자기복제수가 되는 수로는76이 있다. (76^2 = 5776)
//	자연수 1 에서 10000 까지의 수 중에서 자기 복제수인 수를 모두 출력하는 문제이다.
//	
//	입력
//	입력은 없다.
//	출력
//	크기 순으로 한 줄에 하나씩 출력한다.
//	입출력 예
//	
//	출력
//	1
//	5
//	...

package 더블릿;

public class threethirtythree {

	public static void main(String[] args) {

		for(int N = 1; N <= 10000 ; N++)
		{
			if(N < 10)
			{
				if(N == (N*N)%10)
				{
					System.out.println(N);
				}
			}
			else if(N > 10 && N < 100)
			{
				if(N == (N*N)%100)
				{
					System.out.println(N);
				}
			}
			else if(N < 1000 && N < 100)
			{
				if(N == (N*N)%100)
				{
					System.out.println(N);
				}
			}
			else if(N < 1000 && N < 10000)
			{
				if(N == (N*N)%1000)
				{
					System.out.println(N);
				}
			}
			else
			{
				if(N == (N*N)%10000)
				{
					System.out.println(N);
				}
			}
		}

	}

}
