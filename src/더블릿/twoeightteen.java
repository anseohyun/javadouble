//	���α׷� ��: fill
//	���ѽð�: 1 ��
//	[�������] �׸��� ���� ������ �� ������ �־����� , �� �������� �ӵ� , ü�� , �� �� �־��� �� �� �������� �´� �������� ���������� ����ϴ� ���α׷��̴�.
//	�ӵ��� �����̸� ��� , ü�߰� ���� �̻��̸� ���
//		������               ���ǵ�    ������    �� 
//	wide receiver  4.5  150  200
//	lineman        6.0  300  500
//	quarterback    5.0  200  300
//	�Է�
//	�� ���� �־�����. ù ���� �ӵ� , ���� , �� �� �־�����. �� ���� �Ǽ��̴�.
//	���
//	������ �������� ��� ����ϰ� �´� �������� �ϳ��� ������ No positions �� ����Ѵ�.
//	���� �������� ������ ��� �� ǥ�� �־��� ������� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4.4 180 200
//	���
//	Wide Receiver
//	�Է�
//	5.5 350 700
//	���
//	Lineman
//	�Է�
//	4.4 205 350
//	���
//	Wide Receiver Quarterback
//	�Է�
//	5.2 210 500
//	���
//	No positions

package ����;

import java.util.Scanner;

public class twoeightteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double speed = sc.nextDouble();
		int weight = sc.nextInt();
		int power = sc.nextInt();
		int num = 0;
		
		if(speed <= 4.5)
		{
			if(weight >= 150)
			{
				if(power >= 200)
				{
					System.out.print("Wide Receiver ");
					num++;
				}
			}
		}
		if(speed <= 6.0)
		{
			if(weight >= 300)
			{
				if(power >= 500)
				{
					System.out.print("Lineman ");
					num++;
				}
			}
		}
		if(speed <= 5.0)
		{
			if(weight >=200)
			{
				if(power >= 300)
				{
					System.out.println("Quarterback");
					num++;
				}
			}
		}
		
		if(num == 0)
		{
			System.out.print("No positions");
		}
	}

}
