package chap4;

import java.util.Scanner;

//���ڸ� �Է¹޾Ƽ� ���,����, 0 ���� ����ϱ�. 
public class IfEx2 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0 �Դϴ�.");
		}
		//���� ������
		System.out.println((num>0)?"����Դϴ�.":
	 	                   (num<0)?"�����Դϴ�.":"0 �Դϴ�.");
	}
}