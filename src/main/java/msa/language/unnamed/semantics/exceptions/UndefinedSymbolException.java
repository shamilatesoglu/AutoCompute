package msa.language.unnamed.semantics.exceptions;

public class UndefinedSymbolException extends RuntimeException {
    public UndefinedSymbolException(String reference) {
        super(String.format("Unable to resolve symbol: %s", reference));
    }
}
