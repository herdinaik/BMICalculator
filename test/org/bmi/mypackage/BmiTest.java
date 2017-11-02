/**
 * 
 */
package org.bmi.mypackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


/**
 * @author Krisztina Herdinai
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class BmiTest {
	private Bmi bmi;
	private Person mockPerson;
	
	@Before
	public void givenTheBmiObject() {
		mockPerson= mock(Person.class);
		when(mockPerson.getWeight()).thenReturn(60.5);
		when(mockPerson.getHeight()).thenReturn(170.0);
		bmi = new Bmi(mockPerson);
	}
	
	/**
	 * Test method for {@link org.bmi.mypackage.Bmi#getP()}.
	 */
	@Test
	public void testGetP() {
		assertEquals(bmi.getP(), mockPerson);
	}

	/**
	 * Test method for {@link org.bmi.mypackage.Bmi#Bmi(org.bmi.mypackage.Person)}.
	 */
	@Test
	public void testBmiShouldNotBeNull() {
		Bmi bmiObject = new Bmi(mockPerson);
		assertNotNull(bmiObject);
	}

	/**
	 * Test method for {@link org.bmi.mypackage.Bmi#calculate()}.
	 */
	@Test
	public void testCalculate() {
		double result = 18.52;
	
		assertTrue((bmi.calculate() - result) > 0.2);
	}


}
