package com.example.calculator;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/calculator-soap-service/services/CalculatorService?wsdl");
        QName serviceName = new QName("http://calculator.example.com/", "CalculatorServiceImplService");
        
        Service service = Service.create(wsdlURL, serviceName);
        CalculatorService calculator = service.getPort(CalculatorService.class);

        // Test the service
        System.out.println("Addition (5 + 3): " + calculator.add(5, 3));
        System.out.println("Subtraction (10 - 4): " + calculator.subtract(10, 4));
    }
}