package ch7;
class Teacher{
	String name = "선생님";
	void teach() {
		System.out.println("가르치다");
	}
}

class StudentWorker extends Teacher implements Worker, Student{
	String name = "조교";
	
	void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	@Override
	public void study() {
		System.out.println("공부하다");
	}
	@Override
	public void work() {
		System.out.println("학교업무보다");
	}
	@Override
	public void lunch() {
		System.out.println("점심먹다");
	}
	
}




public class InterfaceTest {

	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker();
		sw.study();//인터페이스 구현
		sw.lunch();//인터페이스 구현
		sw.work();//인터페이스 구현
		sw.teach();//클래스 상속
		System.out.println(Student.name);//인터페이스 상속 2개
		System.out.println(Worker.name);
		sw.getName();
		
		
		//매개변수로 전달하는 객체의 다형성
		Student s = new StudentWorker();
		StudentService ser = new StudentService();
		ser.serve(s);
		Student s2 = new HighStudent();
		ser.serve(s2);
		
	}

}

class HighStudent implements Student{

	@Override
	public void study() {
		System.out.println("고등학생이 공부하다");
		
	}

	@Override
	public void lunch() {
		System.out.println("무상급식하다");
		
	}
	
}

class StudentService {
	void serve(Student st) {
		st.study();
	}
	
}
