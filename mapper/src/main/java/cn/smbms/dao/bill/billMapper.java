package cn.smbms.dao.bill;


import cn.smbms.entity.bill;

import java.util.List;
import java.util.Map;

public interface billMapper {

   List<bill> getbyproductName(Map<String,Object> map);

  List<bill> billListbyProvider(Map<String,Object> map);
}
