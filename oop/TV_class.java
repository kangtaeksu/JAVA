package kosta.oop;

public class TV_class {

	int channel;
	String color;
	int volumn;
	boolean power;
	
	
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void power(){
		power = !power;
	}
}