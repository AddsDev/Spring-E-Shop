package com.adds.dev.eshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "productos")
public class Producto  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String resumen;
    @Column(nullable = false)
    private Float precio;

    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Imagen> imagenes;
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Caracterisctica> caracteriscticas;
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Especificacion> especificaciones;

    public Producto() {
    }

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

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Set<Caracterisctica> getCaracteriscticas() {
        return caracteriscticas;
    }

    public void setCaracteriscticas(Set<Caracterisctica> caracteriscticas) {
        this.caracteriscticas = caracteriscticas;
    }

    public Set<Especificacion> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(Set<Especificacion> especificaciones) {
        this.especificaciones = especificaciones;
    }
}
