package com.BiblioTech.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    void guardar(T entidad);
    Optional<T> buscarPorId(ID id);
    List<T> buscarTodos();
}