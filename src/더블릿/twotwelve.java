//	���α׷� ��: ATM(open)
//	���ѽð�: 1 ��
//	
//	���ڴ� ATM(Automated Teller Machine) �⿡�� X $ �� ���� �����ϰ��� �Ѵ�. �� ���� 5 �� ��� �ݾ� ���� ����Ѵ�. ��, ������ �� ���� 0.5 $ �� �����Ḧ ����� �Ѵ�.
//	�ŷ� ���� ���¿��� ���� �ݾ��� ����϶�.
//	
//	�Է�
//	�� ���� �Է����� �־�����.
//	ù ���� ���� �� �ݾ����� �����̰� 0 < X <= 10000
//	���� ���� �Ҽ� ���� �� �ڸ� ���� ���� ���� ������ �ݾ�($)�̴�. 0 <= Y <= 2000
//	���
//	�ŷ� ���� �ܾ��� �Ҽ� ���� ���ڸ��� ����Ѵ�. ���� ���� ������ �Ұ����� ��� ������ �ݾ��� ����Ѵ�. ATM ��迡�� ����� ���� �ִٴ� ���� ����ȴ�.
//	
//	����� ��
//	�Է�
//	30 120.00
//	���
//	89.50
//	�Է�
//	42 120.00
//	���
//	120.00
//	�Է�
//	300 120.00
//	���
//	120.00


package ����;

import java.util.Scanner;

public class twotwelve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double withdraw = sc.nextDouble();
		double balance = sc.nextDouble();
		
		if(withdraw%5==0)
		{
			if(withdraw>(balance-0.5))
			{
				System.out.println(String.format("%.2f", balance));				
			}
			else
			{
				System.out.println(String.format("%.2f",balance-0.5-withdraw));				
			}
		}
		else
		{
			System.out.println(String.format("%.2f", balance));
		}

	}

}
