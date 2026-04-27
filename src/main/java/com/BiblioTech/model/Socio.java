package com.BiblioTech.model;

public abstract class Socio {
    private final int dni;
    private final String nombre;
    private final String email;
    private int librosPrestados;

    public Socio(int dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.librosPrestados = 0;
    }

    public abstract int getLimiteLibros();
    public abstract TipoSocio getTipo();

    public boolean puedeTomarPrestamo() {
        return librosPrestados < getLimiteLibros();
    }

    public void incrementarPrestamos() { librosPrestados++; }
    public void decrementarPrestamos() { if (librosPrestados > 0) librosPrestados--; }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public int getLibrosPrestados() { return librosPrestados; }
}