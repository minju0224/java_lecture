package com.hanwhaswcmap.section03.entity;

import com.hanwhaswcmap.section02.crud.EntityManagerGenerator;
import jakarta.persistence.EntityManager;

public class EntityLifeCycle {
    private EntityManager entityManager;

    public Menu findMenuByMenuCode(int menuCode) {
        entityManager = EntityManagerGenerator.getInstance();
        return entityManager.find(Menu.class, menuCode);
    }

    public EntityManager getEntityInstance() {
        return entityManager;
    }
}
