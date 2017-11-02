/**
 * 
 */
package org.bmi.mypackage;

/**
 * @author Krisztina Herdinai
 *
 */
public class Person {
	private final double weight;
	private final double height;


	public double getWeight() {
		return weight;
	}


	public double getHeight() {
		return height;
	}

	
	public Person(double weight, double height) {
		if(weight > 0 && height > 0) {
			this.weight = weight;
			this.height = height;
		}else {
			throw new IllegalArgumentException("Weight and hight must be positive!");
		}	
	}

}
	
	
