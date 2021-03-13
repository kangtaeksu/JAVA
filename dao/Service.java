package kosta.dao;

public class Service {

	public Dao getD() {
		return d;
	}

	public void setD(Dao d) {
		this.d = d;
	}

	public Service(Dao d) {
		super();
		this.d = d;
	}

	private Dao d;

	public Service() {
	}

	public void insertService() {
		d.insert();////////////////// ÀÌ°Å¸ø¾¸
	}
}
