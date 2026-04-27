package com.BiblioTech.model;

public record Ebook(
        String isbn,
        String titulo,
        String autor,
        int anio,
        CategoriaLibro categoria,
        String formatoArchivo
) implements Recurso {}