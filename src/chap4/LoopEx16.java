package chap4;

import java.util.Scanner;

/*
 * �Է¹��� ���ڰ� ȸ���� ���� �Ǵ��ϴ� ���α׷� 
 * 
 * 12321 : ȸ����
 * 12345 : ȸ�����ƴ�
 */
public class LoopEx16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		int tmp = num; //0
		int result = 0; //321
		while(tmp != 0) { 
			result *=10;        
			result += tmp % 10; 
			tmp /=10;           
		}
		if(num == result) {
			System.out.println(num + "�� ȸ����");
		} else {
			System.out.println(num + "�� ȸ���� �ƴ�");
		}
	}
}
