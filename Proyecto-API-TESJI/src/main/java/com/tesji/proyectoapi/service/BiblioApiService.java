package com.tesji.proyectoapi.service;

import com.tesji.proyectoapi.model.DatosBiblioApi;


import java.util.ArrayList;
import java.util.Optional;

//Definir los metodos para las operaciones CRUD
public interface BiblioApiService {
    ArrayList<DatosBiblioApi> mostrarTodoLibro();
    Optional<DatosBiblioApi> mostrarLibroPorID(long id);
    DatosBiblioApi registrarLibro(DatosBiblioApi libro); //agregar y actualizar
    boolean eliminarLibro(long id);
}
