//	���α׷� ��: lunacy
//	���ѽð�: 1 ��
//	
//	ȣ�Դ� �� �ް��� ���̾�Ʈ�� ���� �Ŀ� �����Կ� ���� ������ ������ ���̰� �Ǿ���. �״� �̻��� ������� �ڽ��� �ո�ȭ �ߴ�.
//	"���� �ٸ� �༺���� �¾�ٸ� �����԰� �پ� �پ���ٵ�"
//	���� �ٸ� �༺�� ���� �ָ� ������ �޸��ص� ���԰� Ȯ���� �پ���. ���������� ���԰� 1 �� �� �޿����� 0.167 �̴�.
//	
//	�Է�
//	�ϳ��̻��� �����Ͱ� �־�����. �־����� ���� �Ǽ��̰� �Է��� ���� ���� �Ǽ��̴�.
//	���
//	�� �Է¿� ���ؼ� �Ʒ� �������� ����Ѵ�.
//	"Objects weighing X on Earth will weigh Y on the moon."
//	X �� ���������� �����̰� , Y �� �޿����� �����̴�. �Ѵ� �Ҽ����� ���ڸ����� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	100.0
//	12.0
//	0.12
//	120000.0
//	-1.0
//	���
//	Objects weighing 100.00 on Earth will weigh 16.70 on the moon.
//	Objects weighing 12.00 on Earth will weigh 2.00 on the moon.
//	Objects weighing 0.12 on Earth will weigh 0.02 on the moon.
//	Objects weighing 120000.00 on Earth will weigh 20040.00 on the moon.
//	
//	����� ����
//	�̷� ������ ������ ����� �迭�� ���� �� �Ѳ����� ������� �����ŵ� �˴ϴ�.
//	�Է� �ް� ó�� �� �ٷ� ���
//	�Է� �ް� ó�� �� �ٷ� ���
//	....
//	���� �Է� �����Ͱ� �ϳ��� �־����� ��찡 �̷� ������ �����Դϴ�.
//	�츮���� �����ø��ǾƵ�(koi) , �̱� �����ø��ǾƵ�(usaco) �ʿ��� case ���� ä���� �ϰ� , ���л� ���α׷��� ��ô�ȸ(acm) �ʿ����� �����͸� ������ �־ ������ Ȯ�� �մϴ�.
//	������ ���� ��� ������ �غ��ϱ⿡�� ���ϱ�� �մϴٸ� Ʋ�� ��� �����Ͱ� ������ �ʾ� ������ ã�Ⱑ ��ƽ��ϴ�.
//	������ �� ��ŭ �ҽ��� �� ö���� �����ؾ� �ϴ� �����̶�� �� �� �ְ�����. �ΰ��� ��� ������� �ִ� �� ���� dovelet ������ ���� ������ ���� ������ �ֽ��ϴ�.

package ����;

import java.util.Scanner;

public class threetwentynine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double weight;
		String wei_earth;
		String wei_moon;
	
		while(true)
		{
			weight = sc.nextDouble();
			wei_earth = String.format("%.2f", weight);
			wei_moon = String.format("%.2f", weight*0.167);
			
			if(weight > 0)
			{
				System.out.println("Objects weighing " + wei_earth + " on Earth will weigh " + wei_moon + " on the moon.");
			}
			else if(weight < 0)
			{
				break;
			}
		}
	}
}