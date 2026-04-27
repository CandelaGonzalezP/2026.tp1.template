package com.BiblioTech.model;

import java.time.LocalDate;

public record Prestamo(
        int id,
        Socio socio,
        Recurso recurso,
        LocalDate fechaPrestamo,
        LocalDate fechaDevolucionEsperada
) {}