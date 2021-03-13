package kosta.interf;

public class Student extends Man {

	public Student() {}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println(getName() + " : 스튜던트열심히 자바공부 ");
	}

	
}
