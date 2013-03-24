package pl.synu;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeClass
	public static void init(){
		calc = new Calculator();
	}
	
	@AfterClass
	public static void destroy(){
		calc = null;
	}

	@Test
	public void testMultiply(){
		int a = 10;
		int b = 4;
		int result = calc.multiply(a, b);
		assertEquals(40, result);
	}
	
	@Test
	public void testDivide(){
		int a = 20;
		int b = 5;
		double result = calc.divide(a, b);
		assertEquals(4, result, 0);
	}
}
