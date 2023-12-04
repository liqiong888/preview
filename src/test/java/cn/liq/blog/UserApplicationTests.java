package cn.liq.blog;

import cn.liq.blog.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }
//    @Test
//    void test(){
//        User user = new User();
//        user.setUsername("zhagnsan");
//        user.setPassword("123456");
//        user.setEmail("");
//        user.setPhone("1234567890");
//        user.setAge(18);
//        user.setSex("男");
//        user.setId(1);
//        userMapper.insertUser(user);
//
//    }



}
