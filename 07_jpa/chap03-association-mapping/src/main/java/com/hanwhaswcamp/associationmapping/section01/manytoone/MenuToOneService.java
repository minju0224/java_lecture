package com.hanwhaswcamp.associationmapping.section01.manytoone;

import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MenuToOneService {

    private ManytoOneRepository manytoOneRepository;

    public MenuToOneService(ManytoOneRepository manytoOneRepository) {
        this.manytoOneRepository = manytoOneRepository;
    }

    public Menu findMenu(int menuCode){
        return manytoOneRepository.find(menuCode);
    }

    public String findCategoryNameByJpql(int menuCode) {
        return manytoOneRepository.findCategoryName(menuCode);
    }

    @Transactional
    public void registMenu(MenuDTO newMenu) {
        Menu menu = new Menu(
                newMenu.getMenuCode(),
                newMenu.getMenuName(),
                newMenu.getMenuPrice(),
                new Category(
                        newMenu.getCategory().getCategoryCode(),
                        newMenu.getCategory().getCategoryName(),
                        newMenu.getCategory().getRefCategoryCode()
                ),
                newMenu.getOrderableStatus()
        );
        manytoOneRepository.regist(menu);
    }
}
