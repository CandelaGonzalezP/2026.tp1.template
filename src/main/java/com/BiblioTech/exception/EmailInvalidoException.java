package com.BiblioTech.exception;

public class EmailInvalidoException extends BibliotecaException {
    public EmailInvalidoException(String email) {
        super("El email no tiene un formato válido: " + email);
    }
}