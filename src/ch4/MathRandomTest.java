package ch4;

public class MathRandomTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java,db,algorithm 시험점수 - 100
		
		int java = (int)(Math.random()*100)+1;
		//소스파일 정수값 변경하면 소수파일 수정 - 재저장 - 재컴파일 - 재실행
		//값 db로부터 - 재실행
		//1-100 난수 저장 - 재실행
		int db = (int)(Math.random()*100)+1;;
		int algo = (int)(Math.random()*100)+1;;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = sum / (double)3;
		System.out.println(name + " 학생은 자바점수= " + java + " , db점수=" + db + " 알고리즘점수=" + algo + " 입니다.");
		System.out.println(name + " 학생은 총점=" + sum + " , 점수평균=" + avg + " , 실수평균=" + avgDouble + " 입니다.");
		//avg : 90이상 100점이하 A등급 부여
		//avg : 80이상 90점미만 B등급 부여
		//avg : 70이상 80점미만 C등급 부여
		//avg : 나머지 미수료 부여
		
		if(avg>=90) {
			System.out.println("A등급 부여");
			//93점 이상 A+
			if(avg >=93) {
				System.out.println("A+등급 부여");
			}
		}else if(avg>=80) {
			System.out.println("B등급 부여");
		}else if(avg>=70) {
			System.out.println("C등급 부여");
		}else {
			System.out.println("미수료 부여");
		}

	}

}
