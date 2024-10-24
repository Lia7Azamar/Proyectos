package com.tesji.proyectoapi.repository;

import com.tesji.proyectoapi.model.DatosBiblioApi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Esta clase define las operaciones CRUD por herencia y metodos anstractos
@Repository
public interface CrudBiblioApiRepository extends CrudRepository<DatosBiblioApi,Long> {

}
