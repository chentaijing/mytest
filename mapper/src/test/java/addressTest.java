//import cn.smbms.dao.Provider.ProviderMapper;
//import cn.smbms.dao.User.UserMapper;
//import cn.smbms.dao.address.addressMapper;
//import cn.smbms.entity.Provider;
//import cn.smbms.entity.User;
//import cn.smbms.entity.address;
//import cn.smbms.util.MybatisUntil;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.log4j.Logger;
//import org.junit.Test;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class addressTest {
//Logger logger=Logger.getLogger(addressTest.class);
//    @Test
//    //map传参
//    public void test08() {
//        List<address> address = null;
//        SqlSession sqlSession = null;
//        Map<String, Object> map = new HashMap<>();
//
//        map.put("id", 1);
//        //连接数据库
//        sqlSession = MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        address=sqlSession.getMapper(addressMapper.class).getaddresslist();
//        MybatisUntil.closeSqlSession(sqlSession);
//        logger.info(address);
//    }
//
//    //添加
//    @Test
//    public void test7() {
//        int i;
//        SqlSession sqlSession=null;
//        address user1=  new address();
//        user1.setContact("那棵树");
//        user1.setAddressDesc("asfd");
//        user1.setPostCode("靖");
//        user1.setCreationDate(new Date());
//        //连接数据
//        sqlSession=MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        i=sqlSession.getMapper(addressMapper.class).addadderss(user1);
//        sqlSession.commit();
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(i);
//    }
////修改
//    @Test
//    public void test8() {
//        int i;
//        SqlSession sqlSession=null;
//
//        address user1=  new address();
//        user1.setContact("沈疴结繁虑");
//        user1.setAddressDesc("大尺度");
//        user1.setPostCode("靖2");
//        user1.setId(7);
//        user1.setCreationDate(new Date());
//        //连接数据
//        sqlSession=MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        i=sqlSession.getMapper(addressMapper.class).updateaddress(user1);
//        sqlSession.commit();
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(i);
//    }
//
//}
