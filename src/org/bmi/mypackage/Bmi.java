package org.bmi.mypackage;


public class Bmi implements BmiInterface{
	private final Person p;
	
	public Bmi(Person p) {
		this.p = p;
	}
	
	public Person getP() {
		return p;
	}
	
	public double calculate() {
		return (p.getWeight())/(Math.pow((p.getHeight()/100),2));
	}
	
	public void writeSolution(double x) {
		String s;
		String xToRound = String.format("%.02f", x);
		
		if(x < 16) {
			s = "Severe Thinness";
		}else if (x >= 16.0 && x < 17.0) {
			s = "Moderate Thinness";
		}else if (x >= 17.0 && x < 18.5) {
			s = "Mild Thinness";
		}else if (x >= 18.5 && x < 25) {
			s = "Normal";
		}else if (x >= 25 && x < 30) {
			s = "Overweight";
		}else if (x >= 30 && x < 35) {
			s = "Obese Class I";
		}else if (x >= 35 && x < 40) {
			s = "Obese Class II";
		}else if (x >= 40) {
			s = "Obese Class III";
		}else {
			s = "Sorry, something went wrong!";
		}
		
		System.out.println("Your BMI is: " + xToRound + " kg/m^2 ("+ s +")");
	}
	
}