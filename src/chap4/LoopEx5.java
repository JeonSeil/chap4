package chap4;
/*
 * 중첩 반복문을 이용하여 직각 삼각형 출력하기
   
  *
  **
  ***
  ****
  *****
  ******
  *******
  ********
  *********
  **********
  
 */
public class LoopEx5 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
