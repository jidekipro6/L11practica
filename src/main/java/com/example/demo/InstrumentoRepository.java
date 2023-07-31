package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instrumento", path = "Instrumentos")
public interface InstrumentoRepository extends CrudRepository<Instrumento, Long> {

}