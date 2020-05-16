package _06_duck;

import javax.swing.JOptionPane;

public class Hedgehog {
	int numberOfSpikes;
	String foodStored;
	void hide() {
		System.out.println("He is hidden.");
	
		
		
	}
	void roll() {
		
		System.out.println("He rolled away safely.");
		
		
	}
	Hedgehog(String foodStored, int numberOfSpikes) {
	  	this.foodStored = foodStored;
	  	this.numberOfSpikes = numberOfSpikes;
	}
}
