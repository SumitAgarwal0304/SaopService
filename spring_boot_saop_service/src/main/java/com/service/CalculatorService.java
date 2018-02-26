package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.calculator.spring.boot.saop.webservice.CalculatorResponse;

@Service
public class CalculatorService {

	/** Method for addition functionality
	 * @param numbers
	 * @param response
	 */
	public String add(List<Double> numbers){
		
		double result = 0.0;
		for (int i = 0; i < numbers.size(); i++) {
			result = result + numbers.get(i);
		}
		return String.valueOf(result);
		
	}
	/**
	 * Method for subtraction functionality
	 * @param numbers
	 * @param response
	 */
	public void subtract(List<Double> numbers, CalculatorResponse response){ 
	
		double result =numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result - numbers.get(i);
		}
		response.setOpertionResponse(String.valueOf(result));
		
	}
	/**
	 * Method for multiplication functionality
	 * @param numbers
	 * @param response
	 */
	public void multiply(List<Double> numbers, CalculatorResponse response){
		
		double result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result  * numbers.get(i);
		}
		response.setOpertionResponse(String.valueOf(result));
	}
	/**
	 * Method for division functionality
	 * @param numbers
	 * @param response
	 */
	public void divide(List<Double> numbers, CalculatorResponse response){
		
		double result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result / numbers.get(i);
		}
		response.setOpertionResponse(String.valueOf(result));
	}
	


}
