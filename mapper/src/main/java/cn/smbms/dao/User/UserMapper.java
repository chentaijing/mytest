package cn.smbms.dao.User;

import cn.smbms.entity.User;
import jdk.nashorn.internal.ir.CallNode;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    //   获取用户数量
    int count();

    //   通过名字作为参数，模糊查询信息
    List<User> getUserListByUsername(String userName);

    //多参查询
    List<User> getUserListByUser(User user);

    //map作为参数传参  List是返回值类型
    List<User> getUserListByMap(Map<String, Object> map);

    List<User> getuserlist(Map<String, Object> map);

    //修改密码，@Param注解参数
    int updatePassword(@Param("id") Integer aa, @Param("word") String passwod);

    List<User> getUserList_choose(@Param("userCode") String code,
                                  @Param("userName") String name,
                                  @Param("userRole")Integer role,
                                  @Param("createDate") Date data);
}
