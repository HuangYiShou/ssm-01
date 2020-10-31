package com.qf.shou.mybatis;

import com.qf.shou.mybatis.entity.User;
import com.qf.shou.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMapper {
    public static void main(String[] args) {
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().
                build(TestMapper.class.getClassLoader().
                getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession(true);
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("abc");
        user.setPassword("123456");
        int insert = um.insert(user);
        System.out.println(insert);


    }
}
