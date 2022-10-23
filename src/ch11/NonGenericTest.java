package ch11;

class Apple{
	String origin;
	Apple(String origin){
		this.origin = origin;
	}
}

class Paper{
	String size;
	Paper(String size){
		this.size = size;
	}
}

class Box{
	Object contents;//상자 내부 내용물 나타내는 변수-내용물 종류 다양하다
	Box(Object contents){
		this.contents = contents;
	}
	public Object getContents() {
		return contents;
	}
	public void setContents(Object contents) {
		this.contents = contents;
	}
	
	
	
	
}
public class NonGenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box aBox = new Box(a);
		Box pBox = new Box(p);
		if(aBox.getContents() instanceof Apple) {
		System.out.println(((Apple)aBox.getContents()).origin);
		}
		
		if(pBox.getContents() instanceof Paper) {
		System.out.println(((Paper)pBox.getContents()).size);
		}
		
		
		
		
	}

}
