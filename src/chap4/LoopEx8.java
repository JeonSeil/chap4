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
public class LoopEx8 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print((j > i) ? "*" : " ");
			}
			System.out.println();
		}
	}
}
