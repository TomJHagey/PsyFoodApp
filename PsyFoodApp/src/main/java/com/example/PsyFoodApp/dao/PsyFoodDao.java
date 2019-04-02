package com.example.PsyFoodApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository

@Transactional

public class PsyFoodDao {
	@PersistenceContext
	private EntityManager em;
	
}
