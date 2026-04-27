package com.BiblioTech.model;

public class Docente extends Socio {
    public Docente(int dni, String nombre, String email) {
        super(dni, nombre, email);
    }

    @Override
    public int getLimiteLibros() { return 5; }

    @Override
    public TipoSocio getTipo() { return TipoSocio.DOCENTE; }
}