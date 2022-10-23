package ch8;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
		//2개 입력변수 필요, 정수변환가능
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(second / first);//결과 : 1
		
		//IllegalArgumentException e = new IllegalArgumentException();
		//throw e; //e 참조 예외 객체 강제 발생
		
		throw new IllegalArgumentException("매개변수 잘못 지정");
		
		//3번 문장 중단 - 예외발생
		//new ArithmeticException() 자동생성
		//catch 검사
		
		
		}
		
		
		
		/*catch(ArithmeticException | NumberFormatException e) {
			System.out.println("0을 입력하거나 숫자가 아닌 값을 입력하셨습니다");
		}*/
		
		
		catch(ArithmeticException e) {//자식예외 먼저
			//first = (int)(Math.random()*100)+1;
			//args[0] = "100";
			System.out.println("0이 아닌 숫자를 입력하세요.");
			//e.printStackTrace();//예외발생원인, 문장, 메소드 추적
			//System.out.println(e.getMessage());//예외발생원인
		}
		catch(Exception e) {//부모예외 먼저
			System.out.println("모든 예외 동일 처리");
			System.out.println(e.getMessage());
		}
		
		/*
		catch(NumberFormatException e) {
			System.out.println("정수 변환 가능 값을 입력하세요");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값은 2개 이상이어야 합니다");
		}*/
		System.out.println("main실행완료");
		
	}

}
/* 100 100 -> 정상 끝 실행
* 100 -> ArrayIndexOutOfBoundsException
* -> ArrayIndexOutOfBoundsException
* aa bb -> NumberFormatException
*0 10 -> ArithmeticException
**/