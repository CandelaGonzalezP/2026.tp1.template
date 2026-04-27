package com.BiblioTech.exception;

public class SocioSinCupoException extends BibliotecaException {
    public SocioSinCupoException(int dni) {
        super("El socio con DNI " + dni + " alcanzó su límite de préstamos.");
    }
}