package project.operations.util;

import project.models.ComplexNumber;
import project.operations.ComplexOperations;

public class Addition implements ComplexOperations {

    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
      
        return new ComplexNumber(a.getReal() + b.getReal(), a.getFake() + b.getFake());
    }
    
}
