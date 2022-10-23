package ch6;


class Student{
	//Student(){}//자동정의 = default constructor-매개변수 있는 생성자가 생겨버려서 매개변수 없는 생성자는 없어짐
	//Student(){System.out.println("생성자호출")};//사용자 정의 변경 = default constructor 수정
	Student(int i, String n, String m){//생성자 1개 정의
		this.id = i;
		this.name = n;
		this.major = m;
	}
	Student(int id, String name){
		this(id,name,"전공미정");
//		this.id = id;
//		this.name = name;
//		major = "전공미정";
	}
	Student(){
		this(-1,"none","전공미정");
//		id = -1;
//		name = "none";
//		major = "전공미정";
	}
	int id;
	String name;
	String major;//전공
	void study() {
		System.out.println(name+" 학생은 "+major+" 공부를 열심히 합니다.");
	}
}



public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student(10000,"김대한","it전산학");
//		st1.id = 10000;
//		st1.name = "김대한";
//		st1.major = "it전산학";
		st1.study();
		
		Student st2 = new Student(20000,"박민국","한국어문학");
//		st2.id = 20000;
//		st2.name = "박민국";
//		st2.major = "한국어문학";
		st2.study();
		
		Student st3 = new Student();
		st3.study();
		
		C c1 = null ;//null값 자동 저장
		C c2 = new C();//객제주소값 저장
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}
}
	
class C{
	int i=10, j=20, k=30;
}
class D{
	int i,j;//변수
	int l = 10;
	int k = 10;
	

	D(){}//생성자
	D(int i){this.i=i;}
	void m1() {//메소드
		System.out.println(j);
	}
}
