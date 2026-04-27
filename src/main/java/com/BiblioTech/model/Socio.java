package com.BiblioTech.model;

import java.time.LocalDate;

public abstract class Socio {
    private final int dni;
    private final String nombre;
    private final String email;
    private int librosPrestados;
    private LocalDate fechaFinSancion;

    public Socio(int dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.librosPrestados = 0;
        this.fechaFinSancion = null;
    }

    public abstract int getLimiteLibros();
    public abstract TipoSocio getTipo();

    public boolean estaSancionado() {
        return fechaFinSancion != null && LocalDate.now().isBefore(fechaFinSancion);
    }

    public void sancionar(int dias) {
        this.fechaFinSancion = LocalDate.now().plusDays(dias);
    }

    public boolean puedeTomarPrestamo() {
        return librosPrestados < getLimiteLibros() && !estaSancionado();
    }

    public void incrementarPrestamos() { librosPrestados++; }
    public void decrementarPrestamos() { if (librosPrestados > 0) librosPrestados--; }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public int getLibrosPrestados() { return librosPrestados; }
    public LocalDate getFechaFinSancion() { return fechaFinSancion; }
}