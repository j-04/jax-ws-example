package com.jaxws.example;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorService extends Service {
    private final static URL CALCULATORSERVERIMPLSERVICE_WSDL;
    private final static WebServiceException CALCULATORSERVERIMLPLSERVICE_EXCEPTION;
    private final static QName CALCULATORSERVICE_QNAME = new QName("http://example.jaxws.com/", "CalculatorServerImplService");
    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculatorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException();
        }
        CALCULATORSERVERIMLPLSERVICE_EXCEPTION = e;
        CALCULATORSERVERIMPLSERVICE_WSDL = url;
    }
    public CalculatorService() {
        super(getWsdlLocation(), CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(WebServiceFeature... features) {
        super(getWsdlLocation(), CALCULATORSERVICE_QNAME, features);
    }

    public CalculatorService(URL wsdlLocation) {
        super(getWsdlLocation(), CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(getWsdlLocation(), serviceName);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(getWsdlLocation(), serviceName, features);
    }

    @WebEndpoint(name = "CalculatorServerImplPort")
    public CalculatorServer getCalculatorPort() {
        return super.getPort(new QName("http://example.jaxws.com/", "CalculatorServerImplPort"), CalculatorServer.class);
    }

    @WebEndpoint(name = "CalculatorServerImplPort")
    public CalculatorServer getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.jaxws.com/", "CalculatorServerImplPort"), CalculatorServer.class, features);
    }

    private static URL getWsdlLocation() {
        if (CALCULATORSERVERIMLPLSERVICE_EXCEPTION != null) {
            throw CALCULATORSERVERIMLPLSERVICE_EXCEPTION;
        }
        return CALCULATORSERVERIMPLSERVICE_WSDL;
    }
}
