package com.tesji.proyectoapi.controller;

import com.tesji.proyectoapi.model.DatosBiblioApi;
import com.tesji.proyectoapi.service.BiblioApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//Esta clase controlador va a permitir
//gestionar las peticiones http (get, post, delete)
//y exponer o deployar la API
//spring trabaja por medio de dependencias y
@RestController  //Expone la clase como una Api REST  (objetos json)
@RequestMapping ("biblioapi")  //Define la URL de la Api
public class APIBiblioteca {

    //Inyectar objeto servicion para utilizar las operaciones CRUD
    @Autowired
    BiblioApiService biblioApiService;

    //este metodo esta retornando un mensaje
    //convertir este metodo a peticion get
    @GetMapping ("/get-prueba") //Define el metodo como una peticion GET y su acceso
    public String pruebaApi(){
        return "Funciona!! Hola Mundo";
    }

    @GetMapping ("/ver-todoslibros")
    public ArrayList<DatosBiblioApi>getVerTodosLibros(){
        return biblioApiService.mostrarTodoLibro();

    }

    @GetMapping ("/ver-libro/{idLibro}")
    public Optional getVerLibro(@PathVariable("idLibro") long id){
        return biblioApiService.mostrarLibroPorID(id);
    }
    @PostMapping("/guardar-libro")
    public DatosBiblioApi postGuardarLibro(@RequestBody DatosBiblioApi book){
        return biblioApiService.registrarLibro(book);
    }
    @DeleteMapping ("/eliminar-libro/{idLibro}")
    public boolean deleteBorrrarLibro(@PathVariable("idLibro")long id){
        return biblioApiService.eliminarLibro(id);
    }
}

