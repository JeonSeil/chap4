package chap4;
/*
 * ��ø �ݺ��� : �ݺ��� ���ο� �ݺ����� ����.
 *           ������ ���� ����ϱ�
 * 
 *  2*2=4  3*2=6  ....    9*2=18
 *  2*3=6  3*3=9 
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print(i+ "��\t");
		}
		System.out.println();
		for(int j=2;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i + "*" + j + "=" + (i*j)+ "\t");
			}
			System.out.println();
		}
	}
}
