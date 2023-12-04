package cn.liq.blog.mapper;

import cn.liq.blog.entity.Blog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BlogMapper {
    @Select(value = "select * from blog")
    List<Blog> query();

    @Select(value = "select * from blog where id = #{id}")
    Blog queryById(Integer id);

    @Select(value = "select * from blog where title = #{title}")
    Blog queryByTitle(String title);

    @Select(value = "select * from blog where author = #{author}")
    List<Blog> queryByAuthor(String author);

    @Update(value = "update blog set title = #{title}, author = #{author}, content = #{content} where id = #{id}")
    void update(Blog blog);

    @Delete (value = "delete from blog where id = #{id}")
    void delete(Integer id);

    @Insert(value = "insert into blog(title, author, content) values(#{title}, #{author}, #{content})")
    void insert(Blog blog);

}
