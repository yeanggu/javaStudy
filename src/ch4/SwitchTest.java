package ch4;

public class SwitchTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java,db,algorithm 시험점수 - 100
		int java = 100;
		int db = 100;
		int algo = 100;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = sum / (double)3;
		System.out.println(name + " 학생은 자바점수= " + java + " , db점수=" + db + " 알고리즘점수=" + algo + " 입니다.");
		System.out.println(name + " 학생은 총점=" + sum + " , 점수평균=" + avg + " , 실수평균=" + avgDouble + " 입니다.");
		
		
		//avg : 90이상 100점이하 A등급 부여
		//avg : 80이상 90점미만 B등급 부여
		//avg : 70이상 80점미만 C등급 부여
		//avg : 나머지 미수료 부여
		
		int avg10 = avg / 10; 
		
		switch(avg10) {
		case 10 : case 9 :
			System.out.println("A등급 부여");
			break;
		case 8 :
			System.out.println("B등급 부여");
			break;
		case 7 :
			System.out.println("C등급 부여");
			break;
		default :
			System.out.println("기타등급 부여");
		}
		
		
		//avg : 90 A등급 부여
		//avg : 80 B등급 부여
		//avg : 70 C등급 부여
		//avg : 나머지 기타등급 부여
		
		/*switch(avg) {
			case 90 :
			System.out.println("A등급 부여");
			break;
			case 80 :
			System.out.println("B등급 부여");
			break;
			case 70 :
			System.out.println("C등급 부여");
			break;
			default :
			System.out.println("기타등급 부여");
		}
		*/

	}

}
