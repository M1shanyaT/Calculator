package project.operations;

import project.models.ComplexNumber;

public class Calculator {

    private ComplexOperations complexoperation;

    public Calculator(ComplexOperations complexoperation) {
        this.complexoperation = complexoperation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
      return complexoperation.operate(a, b);
    }
}
