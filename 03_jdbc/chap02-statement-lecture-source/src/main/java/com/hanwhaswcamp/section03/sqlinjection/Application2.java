package com.hanwhaswcamp.section03.sqlinjection;

import java.sql.*;

import static com.hanwhaswcamp.common.JDBCTemplate.close;
import static com.hanwhaswcamp.common.JDBCTemplate.getConnection;
/* Statement와달리 PreparedStatement는 placeholder를 통한 sql injectoin 공격을 막을 수 있게 작성 되어 있어
* 보안적인 측면에서도 더 우수하다. */
public class Application2 {

    private static String empId = "200";
    private static String empName = "'or 1=1 and emp_id='200";
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "select * from employee where emp_id = ? and emp_name= ?";
        /* placeholder에 싱글쿼테이션이 들어가면 추가적으로 싱클쿼테이션을 넣어 sql injection 공격을 막는다. */
        // select * from employee where emp_id = '200' and emp_name = ''' or 1=1 and emp_id = ''200';
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);
            pstmt.setString(2, empName);

            rs = pstmt.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("emp_name") + "님 환영합니다");
            } else{
                System.out.println("해당 사원은 존재하지 않습니다. ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            close(rs);
            close(pstmt);
            close(con);
        }
    }
}
