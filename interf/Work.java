package kosta.interf;

public class Work extends Man implements Speakable {

	public Work() {}
	public Work(String name) {
		super();
		this.name = name;
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " : 워크열심히 일하자 강택수");
	}
	

}
