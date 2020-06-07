package by.academy.junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorSumTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorSumTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sum({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 2 }, { 6, 2, 8 }, { 18, 2, 20 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getSum(valueA, valueB));
	}
}
