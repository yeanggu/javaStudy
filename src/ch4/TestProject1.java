package ch4;

import java.util.Scanner;
public class TestProject1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);      
	      while(true) {
	         System.out.println("3자리 정수값을 입력하세요.");
	         int t = scan.nextInt();
	         if(t<100) {
	            System.out.print("100이상 1000미만의 3자리 정수여야 합니다.");
	            continue;
	         }else if(t>999) {
	            System.out.print("100이상 1000미만의 3자리 정수여야 합니다.");
	            continue;
	         }else {
	            System.out.println("1번 문제 -------\n입력값:"+t+" 백단위 출력값:"+(t-(t%100)));
	            break;
	         }
	      }
		
		/*int sample = 867;
		System.out.println((sample/100)*100);*/

	}
	
	
	

}
