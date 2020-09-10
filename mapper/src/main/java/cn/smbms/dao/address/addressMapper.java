package cn.smbms.dao.address;

import cn.smbms.entity.address;

import java.util.List;
import java.util.Map;

public interface addressMapper {

 List<address> getaddresslist();
//添加
   int addadderss(address adderss);

//   修改
   int updateaddress(address adderss);
}
