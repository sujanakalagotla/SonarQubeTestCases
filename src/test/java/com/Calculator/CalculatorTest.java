/**
 * 
 */
package com.Calculator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.calculator.calculation.Calculations;

/**
 * @author sujana
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest {

	@Autowired
	Calculations cal;

	@Test
	public void AdditionTest() throws Exception {
		final long result = cal.add(2, 3);
		assertThat(result, is(5L));
	}

	@Test
	public void AdditionWithZero() throws Exception {
		final long result = cal.add(2, 0);
		assertThat(result, is(2L));
	}

	@Test
	public void AdditionWithNegitives() throws Exception {
		final long result = cal.add(2, -2);
		assertThat(result, is(0L));
	}

	@Test
	public void SubtractTest() throws Exception {
		final long result = cal.subtract(3, 2);
		assertThat(result, is(1L));
	}

	@Test
	public void SubtractWithSameDigit() throws Exception {
		final long result = cal.subtract(3, 3);
		assertThat(result, is(0L));
	}

	@Test
	public void SubractWithNegatives() throws Exception {
		final long result = cal.subtract(3, -3);
		assertThat(result, is(6L));
	}

	@Test
	public void MultiplicationTest() throws Exception {
		final long result = cal.multiply(3, 3);
		assertThat(result, is(9L));
	}

	@Test
	public void MultiplicationTestWithZero() throws Exception {
		final long result = cal.multiply(3, 0);
		assertThat(result, is(0L));
	}

	@Test
	public void MultiplicationWithNegatives() throws Exception {
		final long result = cal.multiply(3, -3);
		assertThat(result, is(-9L));
	}

	@Test
	public void DivitionTest() throws Exception {
		final long result = cal.divide(4, 4);
		assertThat(result, is(1L));
	}

	@Test
	public void DivitionWithNegatives() throws Exception {
		final long result = cal.divide(4, -4);
		assertThat(result, is(-1L));
	}
}
