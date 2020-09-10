//
//import cn.smbms.dao.bill.billMapper;
//
//import cn.smbms.entity.bill;
//import cn.smbms.util.MybatisUntil;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class billTest {
//
//    @Test
//    public void test07() {
//        List<bill> bills = null;
//        SqlSession sqlSession = null;
//        Map<String,Object> map = new HashMap();
////        map.put("isPayment", 2);
////        map.put("providerId", 2);
////        map.put("productName", "口");
//        map.put("from", 2);
//        map.put("pagesize", 3);
//
//        sqlSession = MybatisUntil.openSqlSession();
//        bills = sqlSession.getMapper(billMapper.class).getbyproductName(map);
//        MybatisUntil.closeSqlSession(sqlSession);
//        System.out.print(bills);
//    }
//
//    @Test
//    public void test08() {
//        List<bill> bills = null;
//
//        SqlSession sqlSession = null;
//        Map<String,Object> map = new HashMap();
//        map.put("providerId", 2);
//        map.put("isPayment", 2);
//        map.put("productName", "口");
//
//        sqlSession = MybatisUntil.openSqlSession();
//
//        bills = sqlSession.getMapper(billMapper.class).billListbyProvider(map);
//        MybatisUntil.closeSqlSession(sqlSession);
//        for (bill bill:bills) {
//            System.out.print(bill);
//        }
//
//    }
//}