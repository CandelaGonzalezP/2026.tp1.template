package com.BiblioTech.exception;

public class DniDuplicadoException extends BibliotecaException {
    public DniDuplicadoException(int dni) {
        super("Ya existe un socio con DNI: " + dni);
    }
}