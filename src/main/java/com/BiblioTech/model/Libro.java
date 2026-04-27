package com.BiblioTech.model;

public record Libro(
        String isbn,
        String titulo,
        String autor,
        int anio,
        CategoriaLibro categoria,
        boolean disponible
) implements Recurso {}