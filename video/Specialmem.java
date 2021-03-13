package kosta.video;

public class Specialmem extends Generalmem {
	private int bonus;
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Specialmem() {}

	public Specialmem(String id, String name, String address, int bonus) {
		super(id, name, address);
		this.bonus = bonus;
	}
	

	@Override
	public void printMember() {
		super.printMember();
		System.out.println("회원의 보너스 적립 : "+ bonus+"점입니다.");
		}
	

}
