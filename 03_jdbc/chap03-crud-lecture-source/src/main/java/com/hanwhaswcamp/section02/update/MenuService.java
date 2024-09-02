package com.hanwhaswcamp.section02.update;

import java.sql.Connection;

import static com.hanwhaswcamp.common.JDBCTemplate.*;


public class MenuService {
    public void modifyMenu(Menu menu) {
        Connection con = getConnection();

        MenuRepository menuRepository = new MenuRepository();
        int result = menuRepository.updateMenu(con, menu);

        if (result > 0) {
            commit(con);
        } else{
            rollback(con);
        }

        close(con);
    }
}
