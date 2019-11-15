package com.jaxws.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorServer {
    @WebMethod
    int sum(int a, int b);

    @WebMethod
    int diff(int a, int b);

    @WebMethod
    int multiply(int a, int b);

    @WebMethod
    int divide(int a, int b);
}
