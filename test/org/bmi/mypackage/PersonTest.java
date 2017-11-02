/**
 * 
 */
package org.bmi.mypackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Krisztina Herdinai
 *
 */
public class PersonTest {

	private Person p;
	
	@Before
	public void setUp() throws Exception {
		p = new Person(50.5, 160);
	}
	/**
	 * Test method for {@link org.bmi.mypackage.Person#getWeight()}.
	 */
	@Test
	public void testGetWeightShouldReturnTrue() {
		assertTrue(p.getWeight() == 50.5);
	}
	
	@Test
	public void testGetWeightShouldReturnFalse() {
		assertTrue(p.getWeight() != 150.5);
	}

	/**
	 * Test method for {@link org.bmi.mypackage.Person#getHeight()}.
	 */
	@Test
	public void testGetHeightShouldReturnTrue() {
		assertTrue(p.getHeight() == 160);
	}
	
	@Test
	public void testGetHeightShouldReturnFalse() {
		assertTrue(p.getHeight() != 100);
	}

	/**
	 * Test method for {@link org.bmi.mypackage.Person#Person(double, double)}.
	 */
	@Test
	public void testPersonShouldNotBeNull() {
		Person person = new Person(60, 159);
		assertNotNull(person);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPersonWihtNegativeWeightAndShouldThrowAnException(){
		new Person(-60, 159);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPersonWihtWeightOfZeroAndNegativeHeightAndShouldThrowAnException(){
		new Person(0, -2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPersonWihtNegativeValuesAndShouldThrowAnException(){
		new Person(-30, -140);
	}
}
