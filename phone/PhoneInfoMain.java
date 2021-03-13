package kosta.phone;


public class PhoneInfoMain {

	public static void main(String[] args) {

		Manager m = new Manager();

		// 객체를 생성해야 메서드를 불러옴
		// 여기서 선언되니까 의존
		
		//스태틱은 메모리를 한번만쓰기때문에 공용변수처럼쓸수있다.
		//상수는 final static = 대문자로씀, 클래스명으로 호
		while (true) {

			System.out.print("기능 번호를 입력하세요 : ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				//try {
					m.addPhoneInfo();
					System.out.println("저장완료 ");
			//	} 
//				catch (Exception e) {
//					e.printStackTrace();
//				}
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhonInfo();
				break;
			case "4":
				m.rePhonInfo();
				break;
			case "5":
				m.deletePhonInfo();
				break;
			case "6":
		//		어레이리스트를 (폰인포도 시리얼 라이저블 즉하위 클래스는
		//				시리얼 라이저블해야댐 문자열 클래스들은 다되었음)
		//파일에  오브젝트는 아웃풋스트림
				//오브젝트 인풋스트림 
				
				
				
			case "7":
				
			case "8":	
				
				System.out.println("종료");
				return;

			}

			// 키보드입력으로 스위치
		}
	}

}
