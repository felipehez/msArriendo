package com.automotora.MScolaboradores.repository;

import com.automotora.MScolaboradores.entity.ArriendoEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ArriendoRepository extends MongoRepository<ArriendoEntity, Serializable> {

    //Optional<ArriendoEntity> findAll();
    //Optional<ArriendoEntity> findOneByRut(String rut);
    //Optional<List<ArriendoEntity>> findByTipo(String tipo);

}
