package com.example.calculator;

import jakarta.jws.WebService;

@WebService(
    endpointInterface = "com.example.calculator.CalculatorService",
    serviceName = "CalculatorService",
    portName = "CalculatorPort",
    targetNamespace = "http://example.com/calculator"
)
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}