//	���α׷� ��: rao(open)
//	���ѽð�: 1 ��
//	
//	�ﰢ���� �� ���� ���̰� �־��� �� �� �ﰢ���� ����(right) �ﰢ������ , ����(acute) �ﰢ�� ���� , �а�(obtuse) �ﰢ�������� �Ǻ� �϶�.
//	
//	�Է�
//	�� ���� ���� a,b,c �� �־�����.(a,b,c �� 10000 ������ �ڿ���)
//	�̷���� �� ���� �ﰢ���� �־����� �ʴ´�.
//	���
//	right,acute,obtuse �� �ϳ��� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	5 3 4
//	���
//	right

package ����;

import java.util.Scanner;

public class twotwentyeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int long_;
		int short_;
		
		if(a > b)
		{
			if(a > c)
			{
				long_ = a*a;
				short_ = b*b + c*c;
			}
			else 
			{
				if(b > c)
				{
					long_ = b*b;
					short_ = a*a + c*c;
				}
				else 
				{
					long_ = c*c;
					short_ = a*a + b*b;
				}
			}			
		}
		
		else
		{
			if(b > c)
			{
				long_ = b*b;
				short_ = a*a + c*c;
			}
			else 
			{
				if(a > c)
				{
					long_ = b*b;
					short_ = a*a + c*c;
				}
				else 
				{
					long_ = c*c;
					short_ = a*a + b*b;
				}
			}
		}
	
		
		
		if(long_ == short_)
		{
			System.out.println("right");
		}
		else if(long_ > short_)
		{
			System.out.println("obtuse");
		}
		else
		{
			System.out.println("acute");
		}

	}

}
