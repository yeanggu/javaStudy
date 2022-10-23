package ch7;

abstract class Shape{
	abstract public void area();
	abstract public void circum();
}

class Rectangle extends Shape{
	int width=0, height=0;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("가로 = "+width+" 세로 = " +height+" 인 사각형의 면적 "+width*height);
		
	}

	@Override
	public void circum() {
		System.out.println("가로 = "+width+" 세로 = " +height+" 인 사각형의 면적 "+2*(width+height));
		
	}
	//메소드 overriding : 리턴타입, 이름, 매개변수 동일하고 접근 modifier 동일하거니 더 넓어도 된다.
	
	
}

class Circle extends Shape {
	int radius;
	//생성자 정의
	Circle(int r){
		radius = r;
	}
	//상속 - area, circum 오버라이딩
	@Override
	public void area() {
		System.out.println("반지름 = "+radius+ " 인 원의 면적 "+radius*radius*3.14);
		
	}
	@Override
	public void circum() {
		System.out.println("반지름 = "+radius+ " 인 원의 둘레 "+2*radius*3.14);
		
	}
	
	//반지름이 x인 원의 면적 = xxx
	
	//반지름이 x인 원의 둘레 = xxx
	
}

class Parent{
	String name = "부모";
	void tellName() {
		System.out.println(name);
	}
}
class Child extends Parent{
	int su = 2;
	void tellSu() {
		System.out.println(su);
	}
	//overriding
	void tellName() {
		System.out.println("자식");
	}
}


public class AbstractTest {
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.tellName();//자식.형변환된 후에 오버라이딩 된 메소드이면 자식 메소드 호출
		System.out.println(p.name);
		//System.out.println(p.su);
		
		
		//new Rectangle(5,8);
		Shape s1 = new Rectangle(5,8);//가로 5, 세로 8인 사각형
		Shape s2 = new Circle(6);//반지름 6인 원
		Shape s3 = new Circle(7);//반지름 7인 원
		Shape s4 = new Rectangle(10,15);
		
		Shape ar[] = new Shape[4];
		ar[0] = s1;
		ar[1] = s2;
		ar[2] = s3;
		ar[3] = s4;
		
		for(int i = 0; i<ar.length;i++) {
			ar[i].area();
			ar[i].circum();
			if(ar[i] instanceof Circle) {
				Circle c = (Circle)ar[i];//명시적 형변환 이후 변수 Circle 클래스 사용 가능
				System.out.println(c.radius);
			}
			
		}
		//ar[i] 타입 - Shape타입
		//ar[i].메소드()
		//ar[i].변수
		
//		s1.area();
//		s1.circum();
//		s2.area();
//		s2.circum();
	}

}
