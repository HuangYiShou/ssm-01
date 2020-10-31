package com.qf.shou.mybatis.mapper;

import com.qf.shou.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询select，修改update，增加insert，delete假删除 update也就是
    //一个mapper接口对应一个表的这四种操作 双引号里面的为应实体类对象
    int insert(@Param("user") User user);

    User selectUserById(@Param("userId") int userId,@Param("username") String username);

    int updateById(@Param("userId") int userId);
}
