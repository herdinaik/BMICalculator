/**
 * 
 */
package org.bmi.mypackage;

import java.util.*;




/**
 * @author Krisztina Herdinai
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Double weight = null;
		Double height = null;

		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Weight (kg): ");
			weight = Double.parseDouble(sc.next());	
			
		} catch(InputMismatchException | NumberFormatException e) {
			System.out.println("Wrong format!");
			
		} 
		
		
		try {
			System.out.print("Height (cm): ");
			height = Double.parseDouble(sc.next());
			
		} catch(InputMismatchException |NumberFormatException  e) {
			System.out.println("Wrong format!");
			
		} finally {
			sc.close();
		}
		
		
		try {
			Person p = new Person(weight, height);	
			Bmi bmi = new Bmi(p);
					
			double a = bmi.calculate();
			System.out.println("------------");
			bmi.writeSolution(a);
			
		} catch(NullPointerException e) {
			System.out.println("We cannot calculate with these inputs");
			
		} catch(IllegalArgumentException e) {
					System.out.println("Weight and height must be positive.");
		}
	
	}
}
