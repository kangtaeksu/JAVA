package kosta.again;

public class Practice_0128 {

	public static void main(String args[]) {
		
		Car car = null;
		FireEngine fe =new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
	}

}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println(" drive gogo");

	}

	void stop() {
		System.out.println(" stop!!");
	}

}

class FireEngine extends Car{
	void water() {
		System.out.println(" water!!!!");
	}
}