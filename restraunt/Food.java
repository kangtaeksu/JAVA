package kosta.restraunt;

public class Food {

	private String foodname;
	private int price;
	
	public Food() {}
	
	public Food(String foodname, int price) {
		super();
		this.foodname = foodname;
		this.price = price;
	}

	public void show() {
		System.out.println( " ¿ä¸®¸í : "+foodname);
		System.out.println( " price : "+price);
	}
	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
