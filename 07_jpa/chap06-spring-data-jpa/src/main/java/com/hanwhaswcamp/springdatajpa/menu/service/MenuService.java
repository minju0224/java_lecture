package com.hanwhaswcamp.springdatajpa.main.controller;

import com.hanwhaswcamp.springdatajpa.menu.dto.MenuDTO;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    /* Entity to DTO 작업이 필요하다
    * 1. 수동 매필 메소드 작성 (toEntity, fromEntity, toDTO, fromDTO ...)
    * 2. 자동 매핑 라이브러리 사용 */
    public MenuDTO findMenuByMenuCode(int menuCode){

        return null;
    }
}
