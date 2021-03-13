package kosta.restraunt;



public class Order {

	private Food food; //이것이 종속한ㄴ다는 늒밈
	private int amount;
	private int total; //총합을 위한 
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Order() {
	
	}
	
	public void show() {
		food.show();
		System.out.println("amount : "+ amount);
		System.out.println("total price : "+ total);
	}


	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		total = food.getPrice()*amount;////////////////한번에 계산
	}
//	  
//	public void f_Order(String foodname, int price) {
//
//		
//		food[amount++] = new Food(foodname, price);
//		
//	
//	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
