package _04_popcorn;

public class popcornMaker {
	public static void main(String[] args) {
		Popcorn pop = new Popcorn("Cheese");
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(10);
		micro.startMicrowave();
		
		
		
	}
}
