package Flooring;

public class Flooring {
	public static void main(String[] args) {
		
		// Declare variables
		double areaRect;
		double areaTrap;
		double areaRoom;
		double areaBoard;
		double numBoard;
		double packBoard;
		double cost;
		
		// Calculate
		areaRect = 25*15;
		areaTrap = 0.5*(8+17)*8;
		areaRoom = areaRect - areaTrap;
		
		areaBoard = 2 * 0.5;
		numBoard = areaRoom / areaBoard;
		numBoard = 1.25 * numBoard;
		numBoard = (int)(numBoard + 0.5);
		packBoard = (int) (numBoard / 8 + 0.5);
		cost = packBoard * 24.99;
		
		// Print results
		System.out.println("Room area: " + areaRoom);
		System.out.println("Number of boards needed (including extra 25%): " + numBoard);
		System.out.println("Packs of boards needed: " + packBoard);
		System.out.println(packBoard + " packages of boards at $24.99/ea");
		System.out.println("Total cost: " + "$" + cost);	
	}
}