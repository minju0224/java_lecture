package com.hanwhaswcamp.section03.delete;

import java.sql.Connection;

import static com.hanwhaswcamp.common.JDBCTemplate.*;

public class MenuService {

    public void registMenu(Menu menu) {
        Connection con = getConnection();

        MenuRepository menuRepository = new MenuRepository();
        int result = menuRepository.deleteMenu(con, menu);

        if (result > 0) {
            commit(con);
        } else{
            rollback(con);
        }
        close(con);
    }
}
