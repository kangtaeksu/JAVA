package kosta.video;

public class Generalmem {
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;

	public Generalmem() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Generalmem(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void rentalService(Video bollow) {
		this.setRentalVideo(bollow);
	}

	public void printMember() {
		System.out.println("ȸ�����̵� : "+ getId()+" �� ");
		System.out.println("ȸ���ּ� : "+ getAddress()+" ");
		System.out.println("ȸ���� �뿩�� ���� : "+ rentalVideo.getTitle()+ " �� ");
		System.out.println("ȸ���� �뿩�� ���� ���ΰ� : "+ rentalVideo.getActor()+" �� ");
		//���������̵�
	}//�ż����� �ñ׳�ó �� ���� �θ��
//
	public String getId() {
		return id;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
}
