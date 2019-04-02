package com.example.PsyFoodApp.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository

@Transactional

public class PsyFoodDao {

	private EntityManager em;
	
}
