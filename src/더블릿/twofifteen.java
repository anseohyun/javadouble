//	���α׷� ��: punch_game
//	���ѽð�: 1 ��
//	
//	��� PC�濡�� ��ġ ������ �ִ�. Eddy�� ���� �� ���� ������ �÷��� �ϰ� �ִ�.
//	���� Eddy�� �ٰ� �ִ� �ΰ������� HP�� 100 ���Ҵ�. Eddy�� ���ѽð� �ȿ� ������ �Ἥ ��븦 �̰ܾ� �Ѵ�. ��,����� ���ѽð� ������ ������ 10ȸ ���ϸ� �� �� �ִ�.
//	������ ���� ������ ���ݵ��̴�.
//	�ָ�: 10 ������
//	�������� : 15 ������
//	�Ƶ��� : 30 ������
//	������ġ:40 ������
//	������ : 45 ������
//	�ָ�,��������,�Ƶ���,������ġ,������ Ƚ���� �Է¹ް�, ���ѽð� �ʰ��̸� time out,�� �������� 100 �����̸� game over,�� �������� 100 �̻��̸� you win�� ����ϴ� ���α׷��� �ۼ��Ͽ���.
//	��,time out���� you win�̸� time out�� ����ϰ�,time out���� game over�̸� time out�� ����Ѵ�.
//	
//	�Է�
//	�ָ�,��������,�Ƶ���,������ġ,������ Ƚ���� ������ �ΰ� �Էµȴ�.
//	���
//	���ѽð� �ʰ��̸� time out,������ �������� ���� 100�̻��̸� you win,������ �������� ���� 100 �̸��̸� game over�� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4 6 7 8 9
//	���
//	time out

package ����;

import java.util.Scanner;

public class twofifteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int attack_1 = sc.nextInt();
		int attack_2 = sc.nextInt();
		int attack_3 = sc.nextInt();
		int attack_4 = sc.nextInt();
		int attack_5 = sc.nextInt();
		int num = 0;
		int damage = 100;
		
		
		while(attack_1>0)
		{
			damage = damage - 10;
			num++;
			attack_1--;
		}
		while(attack_2>0)
		{
			damage = damage - 15;
			num++;
			attack_2--;
		}
		while(attack_3>0)
		{
			damage = damage - 30;
			num++;
			attack_3--;
		}
		while(attack_4>0)
		{
			damage = damage - 40;
			num++;
			attack_4--;
		}
		while(attack_5>0)
		{
			damage = damage - 45;
			num++;
			attack_5--;
		}
		if(num>10)
		{
		System.out.println("time out");	
		}
		else
		{
			if(damage<0)
			{
				System.out.println("you win");
			}
			else
			{
				System.out.println("game over");
			}
		}

	}

}
