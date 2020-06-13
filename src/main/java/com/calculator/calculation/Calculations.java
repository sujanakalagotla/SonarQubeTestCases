/**
 * 
 */
package com.calculator.calculation;

import org.springframework.stereotype.Component;

/**
 * @author sujana
 *
 */
@Component
public class Calculations {

	public long add(long first, long second) {
		return first + second;
	}

	public long subtract(long first, long second) {
		return first - second;
	}

	public long multiply(long first, long second) {
		return first * second;
	}

	public long divide(long first, long second) {
		return first / second;
	}
}
