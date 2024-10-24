package com.tesji.proyectoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Convierte la clase en una tabla con los atributos definidos
public class DatosBiblioApi  {

    @Id
    private long id;
    private String titulo;
    private String autores;
    private String editorial;
    private String edicion;

    public DatosBiblioApi() {

    }

    //metodo constructor no vacio
    public DatosBiblioApi(String titulo, String autores, String editorial, String edicion) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

}
