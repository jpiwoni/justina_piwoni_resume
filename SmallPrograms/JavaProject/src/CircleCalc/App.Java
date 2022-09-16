package CircleCalc;
import java.util.Random;

public class CircleCalc {
	public static void main(String[] args) {
		
		// Initialize 
		double r;
		double area;
		double circumference;
		
		// Randomly generate radius in a range
			Random gen = new Random();
			r = gen.nextInt(25) + 1; // Assuming range of 1-25 is acceptable
		
		// Calculate area and circumference
		area = Math.PI*r*r;
		circumference = 2*Math.PI*r;
		
		// Print results
		System.out.println("Random radius: " + r);
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
	}
}
