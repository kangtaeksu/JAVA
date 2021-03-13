package kosta.restraunt;



public class Order {

	private Food food; //�̰��� �����Ѥ��ٴ� �b��
	private int amount;
	private int total; //������ ���� 
	
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
		total = food.getPrice()*amount;////////////////�ѹ��� ���
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
