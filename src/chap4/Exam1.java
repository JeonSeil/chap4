package chap4;

import java.util.Scanner;

/*
 * �Ѱ��� ���ڸ� �Է¹޾Ƽ� �빮������, �ҹ�������, ��������, ��Ÿ �������� ����ϱ�
 * [��1]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * A
 * �빮���Դϴ�.
 * [��2]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * c
 * �ҹ����Դϴ�.
 * [��3]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * 6
 * �����Դϴ�.
 * [��4]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * !
 * ��Ÿ�����Դϴ�.
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮���Դϴ�.");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ����Դϴ�.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("��Ÿ �����Դϴ�.");
		}
	}
}
