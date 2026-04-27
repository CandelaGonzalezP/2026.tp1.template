package com.BiblioTech.exception;

public class LibroNoDisponibleException extends BibliotecaException {
    public LibroNoDisponibleException(String isbn) {
        super("El libro con ISBN " + isbn + " no está disponible.");
    }
}