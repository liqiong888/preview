package cn.liq.blog.mapper;

import cn.liq.blog.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select(value = "select * from user where username = #{username}")
    public List<User> queryUser(String username);

    @Insert(value = "insert into user(username, password, email, phone, sex, age) values(#{username}, #{password}, #{email}, #{phone}, #{sex}, #{age})")
    public int insertUser(User user);

    @Update(value = "update user set username = #{username}, password = #{password}, email = #{email}, phone = #{phone}, sex = #{sex}, age = #{age} where id = #{id}")
    public int updateUser(User user);

    @Delete(value = "delete from user where id = #{id}")
    public int deleteUser(int id);

    @Select(value = "select * from user")
    public List<User> queryAll();
}
