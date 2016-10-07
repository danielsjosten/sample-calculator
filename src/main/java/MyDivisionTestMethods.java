import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyDivisionTestMethods {

	Calculator calc = new Calculator();
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("#,###");

	@Test
	public void testdivideSmallSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 11));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 11));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}

	@Test
	public void testdivideMediumSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 101));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 101));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testdivideLargeSizedPositiveNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * 1001));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * 1001));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

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
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testdivideSmallSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testdivideMediumSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -100));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}
	
	@Test
	public void testdivideLargeSizedNegativeNumbers() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 5; i++) {
			firstNumber = Double.valueOf(df.format(rand.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(rand.nextDouble() * -1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calc.divide(firstNumber, secondNumber)), Math.round(result));

		}
	}

}
