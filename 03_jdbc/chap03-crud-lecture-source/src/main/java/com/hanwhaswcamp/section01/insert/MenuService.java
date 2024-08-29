package com.hanwhaswcamp.section01.insert;

import java.sql.Connection;

import static com.hanwhaswcamp.common.JDBCTemplate.*;

/* service 계층은 Connection 객체 생성 및 소멸, 비즈니스 로직, 트랜젝션(commit or rollback) 처리*/
public class MenuService {

    public void registMenu(Menu menu) {
        Connection con = getConnection();

        MenuRepository menuRepository = new MenuRepository();
        int result = menuRepository.insertMenu(con, menu);

        if (result > 0) {
            commit(con);
        } else{
            rollback(con);
        }

        close(con);
    }
}
