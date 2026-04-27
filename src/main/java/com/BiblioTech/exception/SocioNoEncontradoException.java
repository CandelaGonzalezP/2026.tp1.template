package com.BiblioTech.exception;

public class SocioNoEncontradoException extends BibliotecaException {
    public SocioNoEncontradoException(int dni) {
        super("No se encontró socio con DNI: " + dni);
    }
}