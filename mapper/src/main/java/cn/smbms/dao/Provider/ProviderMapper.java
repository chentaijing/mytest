package cn.smbms.dao.Provider;

import cn.smbms.entity.Provider;
import org.apache.ibatis.annotations.Param;


import java.sql.Array;
import java.util.List;
import java.util.Map;

public interface ProviderMapper {
//    供应商数量
    int count1();
//    供应商所用数据
List<Provider> getuserlist(Provider user);

    //添加
    int addProvider(Provider pro);
    //修改
   int updateProvider(Provider pro);

   int deletebyId(@Param("id")Integer aa);

 List<Provider>  getProviderandbill(int id);

  List<Provider>  getProviderandbillarray(Integer[] arrays);

    List<Provider>  getProviderandbillList(List list);

    List<Provider>  getProviderandbillListMap(Map map);
}
