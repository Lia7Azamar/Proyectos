package com.tesji.proyectoapi.service;

import com.tesji.proyectoapi.model.DatosBiblioApi;
import com.tesji.proyectoapi.repository.CrudBiblioApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//Vamos a implemertar y sobreescribir los metodos abstratos del servico CRUD
@Service
public class BiblioApiServicelmpl implements BiblioApiService{
    //Inyectar una clase para ocuparla como objeto ya no se requiere instanciar
    //El objeto heredo los metodos CRUD
    @Autowired
    CrudBiblioApiRepository crudBiblioApiRepository;
    @Override
    public ArrayList<DatosBiblioApi> mostrarTodoLibro() {
        return (ArrayList<DatosBiblioApi>) crudBiblioApiRepository.findAll();

    }

    @Override
    public Optional<DatosBiblioApi> mostrarLibroPorID(long id) {
        return crudBiblioApiRepository.findById(id);
    }

    @Override
    public DatosBiblioApi registrarLibro(DatosBiblioApi libro) {
        return crudBiblioApiRepository.save(libro);
    }

    @Override
    public boolean eliminarLibro(long id) {
        try{
            //Buscar el libro
            Optional<DatosBiblioApi> libro=mostrarLibroPorID(id);
            //Eliminar
            crudBiblioApiRepository.delete(libro.get());
            return true;
        }catch (Exception er){
            return false;
        }
    }
}
