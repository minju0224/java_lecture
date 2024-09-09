package com.hanwhaswcmap.section02.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class EntityManagerCRUD {
    private EntityManager entityManager;

    /* 1. 특정 메뉴 코드로 메뉴를 조회하는 기능 */
    public Menu findMenuByMenuCode(int menuCode){
        entityManager = EntityManagerGenerator.getInstance();
        return entityManager.find(Menu.class, menuCode);
    }

    /* 2. 새로운 메뉴 저장하는 기능 */
    public Long saveAndReturnAllCount(Menu newMenu){
        entityManager = EntityManagerGenerator.getInstance();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(newMenu);

        entityTransaction.commit();

        return getCount(entityManager);
    }
    /* 메뉴 개수 조회 기능 */
    private Long getCount(EntityManager entityManager){
        return entityManager        // JPQL 문법 -> 별도 챕터에서 다룸(엔티티를 대상으로)
                .createQuery("SELECT COUNT(*) FROM Section02Menu", Long.class)
                .getSingleResult();
    }

    /* 3. 메뉴 이름 수정 기능 */
    public Menu modifyMenuName(int menuCode, String menuName){
        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        foundMenu.setMenuName(menuName);

        entityTransaction.commit();

        return foundMenu;
    }

    /* 4. 특정 메뉴 코드로 메뉴 삭제 */
    public long removeAndReturnAllCount(int menuCode){
        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(foundMenu);

        entityTransaction.commit();

        return getCount(entityManager);
    }
}
