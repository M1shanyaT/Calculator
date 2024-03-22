package project.operations.util;

import project.models.ComplexNumber;
import project.operations.ComplexOperations;

public class Multiplication implements ComplexOperations {
    
    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double newReal = a.getReal() * b.getReal() - a.getFake() * b.getFake();
        double newFake = a.getReal() * b.getFake() + a.getFake() * b.getReal();
        return new ComplexNumber(newReal, newFake);
    }

}
