package chap4;

import java.util.Scanner;

/*
 * ������ �Է¹޾� 60�̻��̸� �հ�, �ƴϸ� ���հ� ����ϱ�. �ݵ�� switch ������ �̿��Ͽ� �ۼ��ϱ�
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch (score / 10) {
		   case 10:
		   case 9: 
		   case 8: 
		   case 7: 
		   case 6: grade = "�հ�";break;
		   default : grade = "���հ�";
		}
		System.out.println(score + "������ " + grade + "�Դϴ�.");

	}
}
