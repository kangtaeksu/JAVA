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
		System.out.println(getName() + " : ��ũ������ ������ ���ü�");
	}
	

}
