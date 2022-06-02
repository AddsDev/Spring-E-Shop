package com.adds.dev.eshop.dto;

import com.adds.dev.eshop.domain.Especificacion;

import java.util.List;
import java.util.Set;

public class ProductoDto {
    private Long id;
    private String titulo;
    private String resumen;
    private Float precio;
    private List<ImagenDto> imagenes;
    private Set<CaracteristicaDto> caracteriscticas;
    private Set<EspecificacionDto> especificaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public List<ImagenDto> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenDto> imagenes) {
        this.imagenes = imagenes;
    }

    public Set<CaracteristicaDto> getCaracteriscticas() {
        return caracteriscticas;
    }

    public void setCaracteriscticas(Set<CaracteristicaDto> caracteriscticas) {
        this.caracteriscticas = caracteriscticas;
    }

    public Set<EspecificacionDto> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(Set<EspecificacionDto> especificaciones) {
        this.especificaciones = especificaciones;
    }
}
