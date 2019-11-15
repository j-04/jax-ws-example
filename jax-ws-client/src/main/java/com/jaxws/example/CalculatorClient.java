package com.jaxws.example;

import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        CalculatorServer calculatorServer = calculatorService.getCalculatorPort();
        boolean execute = true;
        while (execute) {
            System.out.print("Enter the command: ");
            switch (new Scanner(System.in).nextLine()) {
                case "add": {
                    System.out.println("SOAP sum: " + calculatorServer.sum(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
                    break;
                }
                case "diff": {
                    System.out.println("SOAP diff: " + calculatorServer.diff(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
                    break;
                }
                case "multiply": {
                    System.out.println("SOAP multiply: " + calculatorServer.multiply(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
                    break;
                }
                case "divide": {
                    System.out.println("SOAP divide: " + calculatorServer.multiply(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
                    break;
                }
                case "break": {
                    execute = false;
                    break;
                }
            }
        }
    }
}
