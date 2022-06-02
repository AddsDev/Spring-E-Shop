package com.adds.dev.eshop.dto;

import com.adds.dev.eshop.domain.Producto;

import javax.persistence.*;

public class EspecificacionDto {
    private Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
