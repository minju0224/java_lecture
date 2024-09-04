package com.hanwhaswcamp.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hanwhaswcamp.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    private MenuDAO menuDAO;

    public MenuService() {
        this.menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        sqlSession.close();
        return menuList;
    }

    public MenuDTO selectMenuByMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();

        MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, menuCode);

        sqlSession.close();
        return menu;
    }

    public boolean registMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDAO.insertMenu(sqlSession,menu);
        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean modifyMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDAO.modifyMenu(sqlSession, menu);
        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean deleteMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        int result = menuDAO.deleteMenu(sqlSession, menu);
        if(result > 0) {
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
