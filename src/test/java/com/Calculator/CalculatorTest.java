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
		int result = cal.add("2", "3");
		assertThat(result, is(5));
	}

	@Test
	public void AdditionWithZero() throws Exception {
		int result = cal.add("2", "0");
		assertThat(result, is(2));
	}

	@Test
	public void AdditionWithNegitives() throws Exception {
		int result = cal.add("2", "-2");
		assertThat(result, is(0));
	}

	@Test
	public void SubtractTest() throws Exception {
		int result = cal.sub("3","2");
		assertThat(result, is(1));
	}

	@Test
	public void SubtractWithSameDigit() throws Exception {
		int result = cal.sub("3", "3");
		assertThat(result, is(0));
	}

	@Test
	public void SubractWithNegatives() throws Exception {
		int result = cal.sub("3", "-3");
		assertThat(result, is(6));
	}

	@Test
	public void MultiplicationTest() throws Exception {
		int result = cal.multiply("3","3");
		assertThat(result, is(9));
	}

	@Test
	public void MultiplicationTestWithZero() throws Exception {
		int result = cal.multiply("3", "0");
		assertThat(result, is(0));
	}

	@Test
	public void MultiplicationWithNegatives() throws Exception {
		int result = cal.multiply("3","-3");
		assertThat(result, is(-9));
	}

	@Test
	public void DivitionTest() throws Exception {
		int result = cal.divide("4","4");
		assertThat(result, is(1));
	}

	@Test
	public void DivitionWithNegatives() throws Exception {
		int result = cal.divide("4", "-4");
		assertThat(result, is(-1));
	}
	
	@Test
	public void DivitionWithZero() throws Exception {
		int result = cal.divide("4", "0");
		assertThat(result, is(0));
	}
}
