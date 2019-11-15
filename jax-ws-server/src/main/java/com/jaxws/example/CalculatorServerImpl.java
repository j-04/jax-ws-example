package com.jaxws.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jaxws.example.CalculatorServer")
public class CalculatorServerImpl implements CalculatorServer {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b ;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
