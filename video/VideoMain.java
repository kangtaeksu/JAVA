package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
//		Video v1 = new Video("1","기생충", "송강호");
//		Video v2=new Video("2","어벤져스", "토니스타크");
//		Video v3 =new Video("3","테넷", "놀란감독");

		Video vrr[] = { new Video("1", "기생충", "송강호"), new Video("2", "어벤져스", "토니스타크"), new Video("3", "테넷", "놀란감독") };
		
		Generalmem arr[] = { new Generalmem("1", "강택수", "화정동"),
							 new Specialmem("2", "자바맨", "금천구", 100)// 얘가 자식이니까 부모밑에
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rentalService(vrr[i]);
			arr[i].printMember();//=> 얘가 증명해낼수있는점 : 자바의 다향성
			//ㅣㅇ렇게 형변환하는 순간 스페셜 멤버(자식)의 유일한 메소드는 활용못함
			Specialmem sp = (Specialmem)arr[1];
				
			sp.getBonus();
			//자식 , 부모 각자 자신들의 프린트 메소드를활용한다.
		}

//		gm.rentalService(v1);
//		sm.rentalService(v2);
//		gm.printMember();
//		sm.printMember();
//		

	}

}
