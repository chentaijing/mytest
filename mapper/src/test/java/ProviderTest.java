//import cn.smbms.dao.Provider.ProviderMapper;
//import cn.smbms.dao.User.UserMapper;
//import cn.smbms.dao.bill.billMapper;
//import cn.smbms.entity.Provider;
//import cn.smbms.entity.User;
//import cn.smbms.entity.bill;
//import cn.smbms.util.MybatisUntil;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//
//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.logging.Logger;
//
//public class ProviderTest {
////    @Test
////    public void test05() {
////        List<User> user=null;
////        SqlSession sqlSession=null;
////        //连接数据库
////        sqlSession= MybatisUntil.openSqlSession();
////        //getuserlist里边的sql方法对数据库操作
////        user=sqlSession.getMapper(ProviderMapper.class).getuserlist();
////        MybatisUntil.closeSqlSession(sqlSession);
////        System.out.print(user);
////    }
//
//    @Test
//    public void test6() {
//        int i;
//        SqlSession sqlSession=null;
//       Provider user1=  new Provider();
//
//        user1.setProCode("靖");
//        user1.setProName("tai");
//
//        user1.setCreatedBy(3);
//        user1.setCreationDate(new Date());
//        //连接数据
//        sqlSession=MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        i=sqlSession.getMapper(ProviderMapper.class).addProvider(user1);
//        sqlSession.commit();
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(i);
//    }
//@Test
//    public void test7() {
//        int i;
//        SqlSession sqlSession=null;
//        Provider user1=  new Provider();
//        user1.setId(19);
//        user1.setProCode("靖4");
//        user1.setProName("tai3");
//        user1.setCreatedBy(35);
//        user1.setCreationDate(new Date());
//        //连接数据
//        sqlSession=MybatisUntil.openSqlSession();
//        //getuserlist里边的sql方法对数据库操作
//        i=sqlSession.getMapper(ProviderMapper.class).updateProvider(user1);
//        sqlSession.commit();
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(i);
//    }
//
//   @Test
//   public void Test(){
//        int i;
//        SqlSession sqlSession=MybatisUntil.openSqlSession();
//        i=sqlSession.getMapper(ProviderMapper.class).deletebyId(8);
//        sqlSession.commit();
//       System.out.println(i);
//       MybatisUntil.closeSqlSession(sqlSession);
//   }
//
//    @Test
//    public void test08() {
//
//        SqlSession sqlSession = null;
//
//        sqlSession = MybatisUntil.openSqlSession();
//
//        List<Provider> provider = sqlSession.getMapper(ProviderMapper.class).getProviderandbill(3);
//        MybatisUntil.closeSqlSession(sqlSession);
//
//            System.out.print(provider);
//
//        }
//    @Test
//    public void test09() {
//
//        SqlSession sqlSession = null;
//
//        sqlSession = MybatisUntil.openSqlSession();
//
//        List<Provider> provider = sqlSession.getMapper(ProviderMapper.class).getProviderandbill(3);
//        System.out.print(provider);
//
//        List<Provider> provider1 = sqlSession.getMapper(ProviderMapper.class).getProviderandbill(3);
//        System.out.print(provider1);
//    }
//
//    @Test
//    public void test10() {
//
//        SqlSession sqlSession = null;
//        Integer[] array = new Integer[]{1,2,3};
//        sqlSession = MybatisUntil.openSqlSession();
//
//        List<Provider> provider = sqlSession.getMapper(ProviderMapper.class).getProviderandbillarray(array);
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(provider);
//
//    }
//
//    @Test
//    public void test11() {
//
//        SqlSession sqlSession = null;
//        List arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(3);
//        sqlSession = MybatisUntil.openSqlSession();
//
//        List<Provider> provider = sqlSession.getMapper(ProviderMapper.class).getProviderandbillList(arrayList);
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(provider);
//
//    }
//    @Test
//    public void test12() {
//
//        SqlSession sqlSession = null;
//        List arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//      Map map = new HashMap();
//
//      map.put("arrayList",arrayList);
//      map.put("productUnit","瓶");
//        sqlSession = MybatisUntil.openSqlSession();
//
//        List<Provider> provider = sqlSession.getMapper(ProviderMapper.class).getProviderandbillListMap(map);
//        MybatisUntil.closeSqlSession(sqlSession);
//
//        System.out.print(provider);
//
//    }
//    }
//
//
