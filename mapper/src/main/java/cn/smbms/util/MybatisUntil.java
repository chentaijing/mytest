package cn.smbms.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUntil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream is = null;
        //配置文件转化为输入流
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 利用SqlSessionFactoryBuilder进行初始化
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
