package chap4;
/*
 * ��ø �ݺ����� �̿��Ͽ� ���� �ﰢ�� ����ϱ�
   
  **********
  *********
  ********
  *******
  ******
  *****
  ****
  ***
  **
  *
  
 */

public class LoopEx6 {
	public static void main(String[] args) {
		for(int i=10;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
