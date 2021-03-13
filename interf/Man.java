package kosta.interf;

public class Man {

	String name;
	private Speakable s;
	public Man() {}

	public Man(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		// TODO Auto-generated method stub
		s.speak();
	}

}
