//	���α׷� ��: calorie(open)
//	���ѽð�: 1 ��
//	
//	� ���Կ��� ���� ������ �޴��� �ִ�. �� ������ �׸��� ���ڷ� �����Ѵ�.
//	
//	3 ������ ���� 
//	
//	1 . Cheeseburger (461 Calories) 
//	2 . Fish Burger (431 Calories) 
//	3 . Veggie Burger (420 Calories) 
//	4 . no burger 
//	
//	3 ���� ����
//	
//	1 . Soft Drink ( 130 Calories)
//	2 . Orange Juice (160 Calories)
//	3 . Milk (118 Calories)
//	4 . no drink
//	
//	3 ���� side order(�߰� �ֹ�)
//	
//	1 . Fries (100 Calories)
//	2 . Baked Potato (57 Calories) 
//	3 . Chef Salad (70 Calories) 
//	4 . no side order 
//	
//	3 ���� ����Ʈ 
//	1 . Apple Pie (167 Calories)
//	2 . Sundae (266 Calories)
//	3 . Fruit Cup (75 Calories)
//	4 . no dessert
//	������ ������ �� Į�θ��� ��� �Ͻÿ�.
//	
//	�Է�
//	1 ���� 4 ������ ���� 4 ���� �־�����. �� ���� ����,����,�߰��ֹ�,����Ʈ �̴�.
//	���
//	�� Į�θ��� ��� ���� �������� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	2 1 3 4
//	���
//	Your total Calorie count is 631.

package ����;

import java.util.Scanner;

public class twothirteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int buger = sc.nextInt();
		int drink = sc.nextInt();
		int side = sc.nextInt();
		int desert = sc.nextInt();
		int cal = 0;

		if(buger==1)
		{
			cal = cal + 461;
		}
		else if(buger == 2)
		{
			cal = cal + 431;
		}
		else if(buger==3)
		{
			cal = cal + 420;
		}
		else
		{
		}

		if(drink == 1)
		{
			cal = cal + 130;
		}
		else if(drink == 2)
		{
			cal = cal + 160;
		}
		else if(drink==3)
		{
			cal = cal + 118;
		}
		else
		{
		}

		if(side == 1)
		{
			cal = cal + 100;
		}
		else if(side == 2)
		{
			cal = cal + 57;
		}
		else if(side==3)
		{
			cal = cal + 70;
		}
		else
		{
		}

		if(desert == 1)
		{
			cal = cal + 167;
		}
		else if(desert == 2)
		{
			cal = cal + 266;
		}
		else if(desert==3)
		{
			cal = cal + 75;
		}
		else
		{
		}

		System.out.println("Your total Calorie count is " + cal + ".");
	}

}
