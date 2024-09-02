package com.hanwhaswcamp.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.hanwhaswcamp.common.JDBCTemplate.close;
import static com.hanwhaswcamp.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();


            Scanner sc = new Scanner(System.in);
            System.out.println("조회하고자하는 사번 입력 : ");
            int empId = sc.nextInt();
            String query  = "select emp_id, emp_name from employee where emp_id = '"+empId+"'";
            rs = stmt.executeQuery(query);

            if(rs.next()) {
                System.out.println(rs.getString("emp_id")+" "+rs.getString("emp_name"));
            }else{
                System.out.println("해당 사원의 조회 결과가 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rs);
            close(stmt);
            close(con);
        }
    }
}
