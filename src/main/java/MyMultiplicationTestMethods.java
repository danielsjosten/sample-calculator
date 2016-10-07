import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyMultiplicationTestMethods {

	Calculator calc = new Calculator();
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("#,####");

	@Test
	public void testmultiplySmallSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 11));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 11));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}

	@Test
	public void testmultiplyMediumSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 101));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 101));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testmultiplyLargeSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 1001));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 1001));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}

	@Test
	public void testZeros() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = 0.0;
			secondNumber = 0.0;
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testmultiplySmallSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testmultiplyMediumSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testmultiplyLargeSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.multiply(firstNumber, secondNumber)), Math.round(result));

		}
	}

}
