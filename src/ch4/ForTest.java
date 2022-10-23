package ch4;

public class ForTest {

	public static void main(String[] args) {
		/* 1-10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		
		//1-10 총합계
		int total = 0;
		for(int i=1;i<=10;i++) {
			//System.out.println(i);
			total = total + i;
			System.out.println("i="+i+"일때 total="+total);
		}
		//System.out.println(i);
		//i는 for문에 국한되기 때문에 for문 괄호 밖에서 사용할 수 없음
		System.out.println(total);
		
		/*while
		int total2 = 0;
		int i2 = 1;
		while(i2<=100) {
			total2 = total2 + i2;
			System.out.println("i2="+i2+"일때 total2="+total2);
			i2++;
		}*/
		
		//do-while
		int total3 = 0;
		int i3 = 101;
		do{
			total3 = total3 + i3;
			System.out.println("i3="+i3+"일때 total3="+total3);
			i3++;
		} while(i3<=100);
		System.out.println(i3);
		
	}

}
