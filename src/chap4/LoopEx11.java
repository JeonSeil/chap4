package chap4;

import java.util.Scanner;

/*
 * ������, ���Ƹ��� �հ� �ٸ����� ���� �Է¹޾Ƽ� 
 * �������� �������� ���Ƹ��� �������� ����ϱ�.
 * ����� �ȵ� ��� ������� ����ϱ�.
 * x + y = �������� ��
 * 4x + 2y = �ٸ��� ��
 */
public class LoopEx11 {
	public static void main(String[] args) {
		System.out.println("�������� ���Ƹ� �� �հ踦 �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int acnt = scan.nextInt();
		System.out.println("�������� ���Ƹ� �� �ٸ��� �հ踦 �Է��ϼ���");
		int lcnt = scan.nextInt();
		boolean search = false;
		for(int d=0;d<=acnt;d++) {
			for(int c=0;c<=acnt;c++) {
				if(((d+c)==acnt) && (d*4+c*2==lcnt)) {
					System.out.println("��������" + d + "�����̰�, ���Ƹ���" + c + "�����Դϴ�.");
					search = true;
				}
			}
		}
		if(!search)
			System.out.println("���� ����");
	}
}
