package com.hanwhaswcamp.section02.prepared;

import java.sql.*;

import static com.hanwhaswcamp.common.JDBCTemplate.close;
import static com.hanwhaswcamp.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        /* 트랜잭션 처리를 위한 DBMS 연동용 Connection 객체 생성 */
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
            // Statement : 쿼릴를 운반하고 결과를 반환하는 객체
            // PrepareStatement(sql) : 객체 생성 시 수정할 sql 구문이 미리 전달 됨
            pstmt = con.prepareStatement("select * from employee");
            // ResultSet : statement 객체를 통해 조회 처리 된 결과를 다루는 객체
            // 객체 생성 시 이미 sql 구문이 전달 되었으므로 실행 시에는 전달하지 않는다.
            rset = pstmt.executeQuery();

            while (rset.next()) {
                //rset은 1행을 참조하고 있으므로 해당 행에서 필요한 컬럼을 getXX 메소드로 타입을 맞춰 꺼내올 수 있다.
                System.out.print(rset.getString("emp_name") + " ");
                System.out.println(rset.getInt("salary"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            /* 생성과 달리 역순으로 각 스트림을 닫는다. */
            close(rset);
            close(con);
        }
    }
}
