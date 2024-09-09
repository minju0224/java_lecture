package com.hanwhaswcmap.section02.crud;

import com.hanwhaswcmap.section01.entitymanager.EntityMangerGenerator;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerGenerator {
    private static EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("jpatest");

    private EntityManagerGenerator() {}

    public static EntityManager getInstance() {return factory.createEntityManager();}
}
