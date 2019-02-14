package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڷ� �̷���� ���ڸ� �Է¹޾� ������ �ڸ����� ���� ���ϱ�
 * ���ڿ��� ���� : String length() �޼���
 * [��1]
 * "123456"  
 * �ڸ����� �� : 21
 *
 * [��2]
 * "123*456"  
 * ���ھƴ�
 */
public class LoopEx12 {
	public static void main(String[] args) {
		System.out.println("���ڵ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		char ch;
		boolean isNum = true;
		for(int i=0;i < value.length();i++) {
			ch = value.charAt(i);
			if( ch < '0' || ch > '9') {  //���� �ƴ�
				isNum = false;
				break;
			}
		}
		int sum = 0;
		if(isNum) {
			for(int i=0;i < value.length();i++) {
				ch = value.charAt(i);
				sum += ch-'0';
			}
			System.out.println("�ڸ��� �հ� :" + sum);
		} else {
			System.out.println("���� �ƴ�");
		}
	}
}
