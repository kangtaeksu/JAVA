package kosta.lamda;

public class LamdaExam01 {

	public static void main(String[] args) {

		MyType mt = new MyType() {

			@Override
			public void hello() {
				System.out.println("unknown inner");
			}
		};
		mt.hello();
//lamda (unknown)
		MyType my1 = () -> {
			System.out.println("lamda style");
		};

		my1.hello();

		MyType my3 = () -> System.out.println(" lamda man");
		my3.hello();

		/////////////////////////////////////////////
		YourType yy1 = (name) -> System.out.println(name);
		yy1.talk("강택수");

		Mynumber mn = (num1, num2) -> num1 > num2 ? num1 : num2;

		System.out.println(mn.getMax(1, 3));

		//////////////// thread/////////////lamda활용
		Runnable rb = () -> {
			for (int i = 1; i < 11; i++) 
				System.out.println(i);
			
		};
		Thread t = new Thread(rb);
		t.start();
	}
}