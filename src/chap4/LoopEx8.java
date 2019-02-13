package chap4;

/*
 * 중첩 반복문을 이용하여 직각 삼각형 출력하기
   
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
