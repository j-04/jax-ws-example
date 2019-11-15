package com.jaxws.example;

import javax.xml.ws.Endpoint;
import java.util.Scanner;

public class CalculatorServerPublisher {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new CalculatorServerImpl());
        endpoint.publish("http://localhost:8080/CalculatorService");
        new Scanner(System.in).next();
        endpoint.stop();
    }
}
