package ch2;

public class VaribleTest {

	public static void main(String[] args) {
		//국어 영어 수학 정수 : 선언 + 값 할당
		int kor = 100;
		int eng = 50;
		int mat = 75;
		//int sci = 99;
		
		//총점 정수 : 선언
		int sum ; 
				
		
		//평균 : 선언
		int avgInt ;
		double avgDouble;
		
		System.out.println("국어점수는 = "+kor); //String + 정수 실수, String + String ==> 요소결합 출력
		System.out.println(kor + eng + mat);//정수, 실수 + 정수, 실수 ==> 산술연산 덧셈
		System.out.println("영어점수는 = "+eng);
		System.out.println("수학점수는 = "+mat);
		
		//영어점수 조정 1.5배
		//eng = 50 * 1.5; 곱하면 실수라서 안됨
		eng = eng * 2;
		sum = kor + eng*2 + mat ;
		avgInt = sum / 3;
		avgDouble = sum / 3.0;
		
				
		System.out.println(sum);
		System.out.println(avgInt);
		System.out.println(avgDouble);
		
		//데이터타입 변수명 = 값
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
		// boolean flag2 = True; 오류
		
		char c1 = '이'; //문자 컴퓨터 이진수 - unicode - 'a' 숫자 대응 변환 = 97
		char c2 = '학';
		char c3 = '생';
		char c4 = '\n'; // new line - 엔터키, \t - tab \w
		System.out.print(c1 + "\n");
		System.out.print(c2);
		System.out.println(c3);
		//System.out.println( (char)c1 + "" + (char)c2 + (char)c3 );
		
		//기본 제공 데이터타입 여러 문자 묶어서 선언 불가능
		//사용자 데이터타입 정의 사용 가능 = (1. 이미 누군가 클래스를 구현한 자바 라이브러리 구현 제공 쓰자 =>2. 사용자)
		//String 클래스 jdk 포함 => 사용자
		String name = "이학생";
		
		
	}

}
