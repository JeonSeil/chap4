package test;
/*
1. ������ ����� �������� ���α׷� �ۼ��ϱ�
  [���]
   (1) + (1+2) + (1 + 2 + 3) + .... (1 + 2 ...+ 10) = 220 
 */
public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			System.out.print("(");
			for(int j=1;j<=i;j++) {
				sum += j;
				System.out.print(j+((j==i)?"":"+"));
			}
			System.out.print(")"+((i==10)?"=":"+"));
		}
		System.out.println(sum);
	}
}
