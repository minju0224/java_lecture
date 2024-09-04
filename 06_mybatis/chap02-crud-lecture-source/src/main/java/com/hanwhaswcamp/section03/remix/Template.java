package com.hanwhaswcamp.section03.remix;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    /* SqlSessionFactory : 애플리케이션 실행하는 동안 존재해야하며 여러 차례 다시 빌드하지 않는것이 좋은 형태이다.
     * => singleton(오로지 1개의 객체만 생성) 하는 패턴을 이용하는 것이 가장 좋다. */
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/menudb";
    private static String USER = "swcamp";
    private static String PASSWROD = "swcamp";

    private static SqlSessionFactory sqlSessionFactory;

    /* 한 전의 요청 당 1개의 sqlsession 객체가 필요하므로 필요시 호출한 메소드 */
    public static SqlSession getSqlSession() {

        if (sqlSessionFactory == null) {
            Environment environment = new Environment(
                    "dev",
                    new JdbcTransactionFactory(),
                    new PooledDataSource(DRIVER, URL, USER, PASSWROD)
            );
            Configuration configuration = new Configuration();
            configuration.addMapper(MenuMapper.class);
            // 컬럼명은 underscore 표기법이고 필드명은 camelcase 표기 법으로 되어 있는데
            // 해당 규칙에 맞추어 컬럼명을 필드명으로 자동 매핑 할 수 있도록 하는 설정
            configuration.setMapUnderscoreToCamelCase(true);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }

        /* SqlSession : Thread에 안전하지 않고 공유 되지 않아야 하므로 요청 시 마다 생성한다. */
        return sqlSessionFactory.openSession(false);
    }
}
