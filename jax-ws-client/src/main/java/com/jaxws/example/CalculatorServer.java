package com.jaxws.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

@WebService(name = "CalculatorServer", targetNamespace = "http://example.jaxws.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorServer {
    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *  returns int
     */
    @WebMethod
    @Action(input = "http://example.jaxws.com/CalculatorServerImplService/sumRequest")
    int sum(
            @WebParam(name = "arg0", partName = "arg0") int arg0,
            @WebParam(name = "arg1", partName = "arg1") int arg1);

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *  returns int
     */
    @WebMethod
    @Action(input = "http://example.jaxws.com/CalculatorServerImplService/diffRequest")
    int diff(@WebParam(name = "arg0", partName = "arg0") int arg0,
             @WebParam(name = "arg1", partName ="arg1") int arg1);

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *  returns int
     */
    @WebMethod
    @Action(input = "http://example.jaxws.com/CalculatorServerImplService/multiplyRequest")
    int multiply(@WebParam(name = "arg0", partName = "arg0") int arg0,
                 @WebParam(name = "arg1", partName ="arg1") int arg1);

    /**
     *
     * @param arg0
     * @param arg1
     * @return
     *  returns int
     */
    @WebMethod
    @Action(input = "http://example.jaxws.com/CalculatorServerImplService/divideRequest")
    int divide(@WebParam(name = "arg0", partName = "arg0") int arg0,
               @WebParam(name = "arg1", partName ="arg1") int arg1);
}
