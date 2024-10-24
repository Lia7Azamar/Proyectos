package com.tesji.proyectoapi.service;

import com.tesji.proyectoapi.model.DatosBiblioApi;
import java.util.ArrayList;
import java.util.Optional;

public interface BiblioApiService {
    ArrayList<DatosBiblioApi> mostrarTodoLibro();
    Optional<DatosBiblioApi> mostrarLibroPorID(long id);
    DatosBiblioApi registrarLibro(long id, DatosBiblioApi libro);
    boolean eliminarLibro(long id);
    DatosBiblioApi modificarLibro(long id, DatosBiblioApi libro);
}