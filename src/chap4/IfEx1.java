package chap4;

import java.util.Scanner;

/*
 * if ���� ����
 * 
 * if (���ǽ�) {
 *    ����1 <-- ���ǽ��� ����� ���� ��� ����Ǵ� �κ�
 *    ....
 * } else if(���ǽ�) {
 *    ����2 <-- ���ǽ��� ����� ���� ��� ����Ǵ� �κ�
 *    ....
 * } else {
 *   ����3 <--- ��� ���ǹ��� ������ ��� ���� �Ǵ� �κ�
 * }
 * 
 * �����ؾ� �Ǵ� ���� �Ѱ��� ���  {  } ���� �ص� �ȴ�.
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) 
			System.out.println("�հ��� �����մϴ�.");
		else 
			System.out.println("���հ� �Դϴ�.");
		
		
		if (score >= 90) {
			System.out.println("A�����Դϴ�. ");
		} else if(score >= 80) {
			System.out.println("B�����Դϴ�. ");
		} else if(score >= 70) {
			System.out.println("C�����Դϴ�. ");
		} else if(score >= 60) {
			System.out.println("D�����Դϴ�. ");
		}
	}
}
