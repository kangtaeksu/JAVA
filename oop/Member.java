package kosta.oop;

public class Member {
	String name;
	int age;

	public Member(){} //=>디폴트 생성자 무조건 생기는데 우리눈에 안보일뿐
	//그냥 무조건 써주는 습관을 가지자!
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}//소스에서 만든 생성자 이게잇을려면 디폴트 생성자가 있어야함
	
	
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}


}
