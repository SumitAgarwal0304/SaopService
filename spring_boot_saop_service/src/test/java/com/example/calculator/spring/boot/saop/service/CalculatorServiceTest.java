package com.example.calculator.spring.boot.saop.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.calculator.spring.boot.saop.webservice.CalculatorResponse;
import com.service.CalculatorService;

public class CalculatorServiceTest {
	

	@Test
	public void testAdd() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		CalculatorService calculatorService= new CalculatorService();
		String d=calculatorService.add(numbers);
		assertEquals("3.0", d);
	}

}
