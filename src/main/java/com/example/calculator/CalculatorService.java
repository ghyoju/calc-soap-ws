package com.example.calculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CalculatorService {
    @WebMethod
    int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

    @WebMethod
    int subtract(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
}