/**
 * 
 */
package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.calculation.Calculations;
import com.calculator.calculation.Request;
import com.calculator.calculation.Response;

/**
 * @author sujana
 *
 */
@RestController
public class CalculationController {

	@Autowired
	Calculations calculations;

	@PostMapping(value = "/calculation")
	public ResponseEntity<Response> add(@RequestBody Request request) {
		Response response = new Response();
		switch (request.getType()) {
		case "add": {
			response.setResult(calculations.add(request.getNum1(), request.getNum2()));
			break;
		}
		case "sub": {
			response.setResult(calculations.sub(request.getNum1(), request.getNum2()));
			break;
		}
		case "multi": {
			response.setResult(calculations.multiply(request.getNum1(), request.getNum2()));
			break;
		}
		case "div": {
			response.setResult(calculations.divide(request.getNum1(), request.getNum2()));
			break;
		}

		default: {

		}

		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
