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
		System.out.println("회원아이디 : "+ getId()+" 님 ");
		System.out.println("회원주소 : "+ getAddress()+" ");
		System.out.println("회원이 대여한 비디오 : "+ rentalVideo.getTitle()+ " 님 ");
		System.out.println("회원이 대여한 비디오 주인공 : "+ rentalVideo.getActor()+" 님 ");
		//오버ㅏㄹ이딩
	}//매서드의 시그너처 는 같다 부모와
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
