package kosta.interf;

public class Reader extends Man implements Speakable {

	public Reader() {}
	public Reader(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" : �Ӥ����ڹ�ȭ����");
	}

}
