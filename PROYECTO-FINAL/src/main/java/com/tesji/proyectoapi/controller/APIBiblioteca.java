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
    private BiblioApiService biblioApiService;

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
        // Si se proporciona un ID, verifica si ya existe antes de registrar el libro
        if (book.getId() != 0) {
            Optional<DatosBiblioApi> existingBook = biblioApiService.mostrarLibroPorID(book.getId());
            if (existingBook.isPresent()) {
                throw new RuntimeException("ID ya existe");
            }
        }
        return biblioApiService.registrarLibro(book.getId(), book);
    }


    @PutMapping("/modificar-libro/{idLibro}")
    public DatosBiblioApi putModificarLibro(@PathVariable("idLibro") long id, @RequestBody DatosBiblioApi book) {
        return biblioApiService.modificarLibro(id, book);
    }

    @DeleteMapping ("/eliminar-libro/{idLibro}")
    public boolean deleteBorrrarLibro(@PathVariable("idLibro")long id){
        return biblioApiService.eliminarLibro(id);
    }
}

