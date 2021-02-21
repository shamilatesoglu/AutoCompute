package msa.lang.unnamed.semantics.exceptions;

public class AlreadyDefinedException extends RuntimeException {
    public AlreadyDefinedException(String reference, String scopeId) {
        super(String.format("%s is already defined in %s", reference, scopeId));
    }
}
