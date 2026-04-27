package com.BiblioTech.model;

public class Estudiante extends Socio {
    public Estudiante(int dni, String nombre, String email) {
        super(dni, nombre, email);
    }

    @Override
    public int getLimiteLibros() { return 3; }

    @Override
    public TipoSocio getTipo() { return TipoSocio.ESTUDIANTE; }
}