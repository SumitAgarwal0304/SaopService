package com.example.calculator.spring.boot.saop.service.endpoint;

import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.calculator.spring.boot.saop.webservice.CalculatorRequest;
import com.example.calculator.spring.boot.saop.webservice.CalculatorRequest.NumberArray;
import com.example.calculator.spring.boot.saop.webservice.CalculatorResponse;

@Endpoint
public class CalculatorEndPoint {
	
	@PayloadRoot(namespace = "Calculator",localPart = "calculatorRequest")
	@ResponsePayload
	public CalculatorResponse getcalculatorResponse(@RequestPayload CalculatorRequest calculatorRequest) {
		System.out.println("inside the method");
		double sum=0;
		if(calculatorRequest.getOperation().equals("add")) {
			
			for(double n : calculatorRequest.getNumberArray().getNumber()) {
				sum=sum+n;
			}
		}
		CalculatorResponse calculatorResponse = new CalculatorResponse();
		calculatorResponse.setOpertionResponse(String.valueOf(sum));
		return calculatorResponse;
	}
	
}
