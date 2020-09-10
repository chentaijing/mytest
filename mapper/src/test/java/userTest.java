import cn.smbms.dao.Provider.ProviderMapper;
import cn.smbms.dao.User.UserMapper;
import cn.smbms.entity.Provider;
import cn.smbms.entity.User;
import cn.smbms.util.MybatisUntil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class userTest {

//    Logger logger = Logger.getLogger("userTest");
//
//    @Test
//    public void test01() {
////    InputStream is=null;
////    try {
//        // 配置文件转化为输入流
////        is= Resources.getResourceAsStream("mybatis-config.xml");
////    } catch (IOException e) {
////        e.printStackTrace();
////    }
////
////    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
//
//        SqlSession sqlSession = null;
//        int i = 0;
//        try {
//            sqlSession = MybatisUntil.openSqlSession();
//            i = sqlSession.selectOne("cn.smbms.dao.User.UserMapper.count");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            MybatisUntil.closeSqlSession(sqlSession);
//        }
//
//        System.out.println("用户数量为：" + i);
//        logger.info("i");
//    }
//
////    @Test
////    public void test02() {
////        Integer i = null;
////        SqlSession sqlSession = null;
////        sqlSession = MybatisUntil.openSqlSession();
////        i = sqlSession.getMapper(ProviderMapper.class).count1();
////        MybatisUntil.closeSqlSession(sqlSession);
////        System.out.println(i);
////    }
////        InputStream is = null;
////        try {
////            is = Resources.getResourceAsStream("mybatis-config.xml");
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
////        SqlSession sqlSession = build.openSession();
//    //selectOne是sqlSession特有方法，返回单个数据
////        int i = sqlSession.selectOne("cn.smbms.dao.Provider.ProviderMapper.count1");
////        System.out.println(i);
////    }
//
////    @Test
////    public void test03() {
////        SqlSession sqlSession = null;
////        List<User> list = null;
////
////        sqlSession = MybatisUntil.openSqlSession();
////        //selectList 返回集合数据
////        list = sqlSession.selectList("cn.smbms.dao.user.Provider.getuserlist");
////        MybatisUntil.closeSqlSession(sqlSession);
////
////        System.out.println(list);
////    }
//
////    @Test
////    public void test04() {
////        SqlSession sqlSession = null;
////        List<User> list = null;
////
////        sqlSession = MybatisUntil.openSqlSession();
////        //getMapper  获取接口字节码对象，ProviderMapper对象
////        //ProviderMapper.class接口字节码对象
////        //ProviderMapper 是类名
////        list = sqlSession.getMapper(ProviderMapper.class).getuserlist();
////        MybatisUntil.closeSqlSession(sqlSession);
////
////        System.out.println(list);
////    }
//
//    //查询供应商所有信息
////  查询供应商所有信息  @Test
////    public void test05() {
////        List<User> user = null;
////        SqlSession sqlSession = null;
////        //连接数据库
////        sqlSession = MybatisUntil.openSqlSession();
////        //getuserlist里边的sql方法对数据库操作
////        user = sqlSession.getMapper(ProviderMapper.class).getuserlist();
////        MybatisUntil.closeSqlSession(sqlSession);
////        System.out.print(user);
////    }
//
//    //    模糊查询
//    @Test
//    public void test06() {
//        List<User> user = null;
//        SqlSession sqlSession = null;
//        //连接数据库
//        sqlSession = MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        user = sqlSession.getMapper(UserMapper.class).getUserListByUsername("北");
//        MybatisUntil.closeSqlSession(sqlSession);
//        System.out.print(user);
//    }
//
////    @Test
////    public void test07() {
////        List<User> user = null;
////        SqlSession sqlSession = null;
////        User user1 = new User();
////        user1.setId(1);
////        user1.setUserName("北");
////        //连接数据库
////        sqlSession = MybatisUntil.openSqlSession();
////        //getuserlist里边的sql方法对数据库操作
////        user = sqlSession.getMapper(UserMapper.class).getUserListByUser(user1);
////        MybatisUntil.closeSqlSession(sqlSession);
////        System.out.print(user);
////    }
//
//    @Test
//    //map传参
//    public void test08() {
//        List<User> user = null;
//        SqlSession sqlSession = null;
//        Map<String, Object> map = new HashMap<>();
//        //proName1 id1作为键值，要以sql语句的 proName like  concat('%',#{proName1},'%') and id=#{id1} proName1 id1 参数名一致
//        map.put("proName1", "北");
//        map.put("id1", 1);
//        //连接数据库
//        sqlSession = MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        user = sqlSession.getMapper(UserMapper.class).getUserListByMap(map);
//        MybatisUntil.closeSqlSession(sqlSession);
//        System.out.print(user);
//    }
////
////    @Test
////    public void test09() {
////        List<User> list = null;
////        SqlSession sqlSession = null;
////        Map<String, Object> map = new HashMap<>();
////        map.put("userName", "孙");
////        map.put("userRole", 3);
////
////        //连接数据库
////        sqlSession = MybatisUntil.openSqlSession();
////        //getuserlist里边的sql方法对数据库操作
////        list = sqlSession.getMapper(UserMapper.class).getuserlist(map);
////
////        for (User user : list) {
////            System.out.print(user);
////        }
////        System.out.println(list);
////        MybatisUntil.closeSqlSession(sqlSession);
////    }
//
//    //Param传参  总结 传参方式有基本数据传参，传一个参数，实例（封装类）传参，map传参，Param传参（3到4个参数适合用，参数太多建议使用map或封装一个实例传参）
//
////    @Test
////    public void test7() {
////        int i;
////        SqlSession sqlSession = null;
////        //连接数据
////        sqlSession = MybatisUntil.openSqlSession();
////        //getuserlist里边的sql方法对数据库操作
////        i = sqlSession.getMapper(UserMapper.class).updatePassword(1, "8989");
////        sqlSession.commit();
////        MybatisUntil.closeSqlSession(sqlSession);
////
////        System.out.print(i);
////    }
//
    @Test
    public void test10() {
        List<User> user = null;
        SqlSession sqlSession = null;
        //连接数据库
        sqlSession = MybatisUntil.openSqlSession();
        //getuserlist里边的sql方法对数据库操作
        user = sqlSession.getMapper(UserMapper.class).getUserList_choose("zhaomin",null,null,null);
        MybatisUntil.closeSqlSession(sqlSession);
        System.out.print(user);
    }
}