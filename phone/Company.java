package kosta.phone;

import java.io.Serializable;

public class Company extends PhoneInfo implements Serializable{
//
	private String dept;//�μ�
	private String position;
	
	public Company() {}

	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("�μ� : " + dept);
		System.out.println("��å : " + position);
	}
	

	
}
