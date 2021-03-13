package kosta.video;

public class Order {

	int o_num;
	String person;
	Product o_name;

	
	public int getO_num() {
		return o_num;
	}

	public void setO_num(int o_num) {
		this.o_num = o_num;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Product getO_name() {
		return o_name;
	}

	public void setO_name(Product o_name) {
		this.o_name = o_name;
	}

	
	public Order() {
	}

	public Order(int o_num, String person) {
		super();
		this.o_num = o_num;
		this.person = person;
	}

	public void buy(Product buynow) {
		this.o_name = buynow;
	}

}
