package com.gleenpeltroche.idiomas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gleenpeltroche.idiomas.models.Idioma;

@Repository
public interface IdiomaRepository extends CrudRepository<Idioma, Long> {
	List<Idioma> findAll();
}