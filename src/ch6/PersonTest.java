package ch6;

class Person{
	String name;
	int age;
	static final String nation="대한민국";
}




public class PersonTest {

	public static void main(String[] args) {
		
		System.out.println(Person.nation);
		
		
		Person p1 = new Person();
		p1.name = "김기술";
		p1.age = 23;
		//p1.nation= "대한민국"; ->참조변수.클래스변수 ㅇ, 클래스명.클래스변수 ㅇ
		System.out.println(p1.name + " 은 나이가 " +p1.age+" 이고 국적은 "+p1.nation+" 입니다");
		
		Person p2 = new Person();
		p2.name = "박정보";
		p2.age = 33;
		//p2.nation= "대한민국";
		System.out.println(p2.name + " 은 나이가 " +p2.age+" 이고 국적은 "+p2.nation+" 입니다");

		
	}

}
