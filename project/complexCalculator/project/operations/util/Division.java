package project.operations.util;

import project.models.ComplexNumber;
import project.operations.ComplexOperations;

public class Division implements  ComplexOperations{

    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double denom = b.getReal() * b.getReal() + b.getFake() * b.getFake();
        double realPart = (a.getReal() * b.getReal() + a.getFake() * b.getFake()) / denom;
        double fakePart = (a.getFake() * b.getReal() - a.getReal() * b.getFake()) / denom;
        return new ComplexNumber(realPart, fakePart);
    }
  

}
