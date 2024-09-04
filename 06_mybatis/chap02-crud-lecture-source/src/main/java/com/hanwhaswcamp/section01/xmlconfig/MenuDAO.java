package com.hanwhaswcamp.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {
        /* 매소드의 첫 번째 인자로 어떠한 sql 구문을 수행할 것인지를 전달한다.
        * Maapper의 namespace의 id로 구분한다. */
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

    public MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int menuCode) {
        /* 메소드의 두 번쨰 인자로 sql 구문을 수행할 때 필요한 객체를 전달한다.  */
        return sqlSession.selectOne("MenuMapper.selectMenuByMenuCode", menuCode);
    }

    public int insertMenu(SqlSession sqlSession, MenuDTO menu) {
        return sqlSession.insert("MenuMapper.insertMenu",menu);
    }

    public int modifyMenu(SqlSession sqlSession, MenuDTO menu) {
        return sqlSession.update("MenuMapper.modifyMenu",menu);
    }

    public int deleteMenu(SqlSession sqlSession, MenuDTO menu) {
        return sqlSession.delete("MenuMapper.deleteMenu",menu);
    }
}
