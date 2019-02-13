package chap4;
/*
 * 중첩 반복문 : 반복문 내부에 반복문이 존재.
 *           구구단 가로 출력하기
 * 
 *  2*2=4  3*2=6  ....    9*2=18
 *  2*3=6  3*3=9 
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print(i+ "단\t");
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
