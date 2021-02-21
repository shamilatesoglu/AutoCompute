package msa.lang.autocompute.runtime.exceptions;

import java.util.List;

public class ConstraintDissatisfactionException extends RuntimeException {

    private final List<String> constraintRationales;

    public ConstraintDissatisfactionException(List<String> constraintRationales) {
        this.constraintRationales = constraintRationales;
    }
}
