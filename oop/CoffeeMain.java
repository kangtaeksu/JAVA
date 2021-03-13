package kosta.oop;

public class CoffeeMain {

	public static void main(String[] args) {

		Coffee cf[] = { new Coffee("Americano", "Cold", "Tall"), 
				new Coffee("CafeMoca", "HOT", "Grande"), 
				new Coffee("Camomile", "HOT", "Large") };

		for (int i = 1; i < cf.length; i++) {
			cf[i].calculate();
			cf[i].order();
		}

	}

}
