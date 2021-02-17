package msa.language.unnamed.runtime.exceptions;

public class DependencyNotFoundException extends RuntimeException {
    public DependencyNotFoundException(String message) {
        super(message);
    }
}
