package com.hanwhaswcamp.associationmapping.section03.bidirection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BiDirectionService {

    private BiDirectionRepository biDirectionRepository;

    public BiDirectionService(BiDirectionRepository biDirectionRepository) {
        this.biDirectionRepository = biDirectionRepository;
    }

    public Menu findMenu(int menuCode) {
        return biDirectionRepository.findMenu(menuCode);
    }

    @Transactional
    public Category findCategory(int categoryCode) {
        Category category = biDirectionRepository.findCategory(categoryCode);
        /* 양방향 참조를 구현하면 양방향 그래프 탐색이 가능하다. */
        System.out.println(category.getMenuList());
        System.out.println(category.getMenuList().get(0).getCategory());
        return category;
    }
}
