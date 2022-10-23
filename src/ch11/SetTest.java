package ch11;

import java.util.HashSet;

public class SetTest {
	//set.set(0,"aaa"); list o / set x
	//set.get(0) list o/ set x
	
	//HashSet 데이터 동일성 검사
	//1>hashCode()메소드 리턴값 동일하면
	//2>equals() 메소드 true 이면
	// 데이터 동일-중복-저장무시 

	public static void main(String[] args) {
		HashSet set = new HashSet();//데이터저장가능 크기 가변
		System.out.println("100저장= "+set.add(100));
		System.out.println("java저장= "+set.add("java"));
		//System.out.println("100삭제= "+set.remove(100));
		System.out.println("java저장= "+set.add("java"));//중복무시
		
		System.out.println("사번 100 회사원저장= "+set.add(new Employee(100,"박사원",360000.55)));
		System.out.println("사번 100 회사원저장= "+set.add(new Employee(100,"이사원",360000.55)));//중복 무시
		
		
		System.out.println(set.size());
		
		//set 데이터를 조회
		
//		for(int i = 0; i<set.size();i++) {
			//System.out.println(set.get(i));
//		}
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("java");
		set2.add("jsp");
		set2.add("react");
		set2.add("jquery");
		
		for(String s:set2) {
			System.out.println(s);
		}
		
		//set2내부에서 jsp 문자 존재하는지 판단
		System.out.println(set2.contains("jsp"));
		
		System.out.println("====================================");
		
		//collection타입을 배열 결과 변경
		String[] result = new String[set2.size()];
		set2.toArray(result);
		
		for(String s : result) {//result만큼 반복하라 for의 향상문, list.배열. set 쓸수있음
			System.out.println(s);
		}
	}

}
