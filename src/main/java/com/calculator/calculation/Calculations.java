/**
 * 
 */
package com.calculator.calculation;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author sujana
 *
 */
@Component
public class Calculations {

	public static final Logger logger = LoggerFactory.getLogger(Calculations.class);

	public int add(String first, String second) {
		int add = 0;
		if (!StringUtils.isEmpty(first) && first.matches("^[0-9-]+") && !StringUtils.isEmpty(second)
				&& second.matches("^[0-9-]+")) {
			logger.info("add method first: {} and second: {}", first,  second);
			add = (Integer.parseInt(first) + Integer.parseInt(second));
		} else {
			logger.info("Enter numeric values :: first : {}  Second : {}", first, second);
		}
		return add;
	}

	public int sub(String first, String second) {
		int subt = 0;
		if (!StringUtils.isEmpty(first) && first.matches("^[0-9-]+") && !StringUtils.isEmpty(second)
				&& second.matches("^[0-9-]+")) {
			logger.info("add method first: {} and second: {}", first,  second);
			subt = (Integer.parseInt(first) - Integer.parseInt(second));
		} else {
			logger.info("Enter numeric values :: first : {}  Second : {}", first, second);
		}
		return subt;
	}
	public int multiply(String first, String second)
	{
		int mul
		=0;
	if (!StringUtils.isEmpty(first) && first.matches("^[0-9-]+") && !StringUtils.isEmpty(second)
			&& second.matches("^[0-9-]+")) {
		logger.info("add method first: {} and second: {}", first,  second);
		mul = (Integer.parseInt(first) * Integer.parseInt(second));
	} else {
		logger.info("Enter numeric values :: first : {}  Second : {}", first, second);
	}
	
	return mul;
	}

	public int divide(String first, String second) {
		try {
			int div=0;
			if (!StringUtils.isEmpty(first) && first.matches("^[0-9-]+") && !StringUtils.isEmpty(second)
					&& second.matches("^[0-9-]+")) {
				logger.info("add method first: {} and second: {}", first,  second);
				div = (Integer.parseInt(first) / Integer.parseInt(second));
			} else {
				logger.info("Enter numeric values :: first : {}  Second : {}", first, second);
			}
			
			return div;
		} catch (Exception e) {
			System.out.println("exception occured :: " + e.getMessage());
		}
		return 0;
	}
}
