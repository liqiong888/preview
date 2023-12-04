package cn.liq.blog.controller;

import cn.liq.blog.mapper.BlogMapper;
import cn.liq.blog.entity.Blog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;


@RestController
@RequestMapping("/blog")
@Api(tags = "博客相关接口")
public class BlogController {

    public static final String name = "liq";
    public static final String account = "liq";
    public static final String password = "123456";
    public static final String email = "liqiong@test.com";
    public static final String filepath = "./test/setst/stes/test.txt";
    public static final int number = 99;


    @Autowired
    private BlogMapper blogMapper;

    /**
     * 查询所有博客
     *
     * @return 所有博客的列表
     */
    @GetMapping(value = "/query")
    @ApiOperation(value = "查询所有博客", notes = "查询所有博客")
    public List<Blog> query() {
        return blogMapper.query();
    }


    /**
     * 根据id查询博客
     *
     * @param id 博客的id
     * @return 根据id查询到的博客
     */
    @GetMapping(value = "/query/{id}")
    @ApiOperation(value = "根据id查询博客", notes = "根据id查询博客")
    public Blog queryById(@PathVariable("id") Integer id) {
        return blogMapper.queryById(id);
    }


    /**
     * 根据标题查询博客
     *
     * @param title 博客的标题
     * @return 查询到的博客对象
     */
    @GetMapping(value = "/query/title/{title}")
    @ApiOperation(value = "根据标题查询博客", notes = "根据标题查询博客")
    public Blog queryByTitle(@PathVariable("title") String title) {

        File file = new File(filepath);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.isDirectory()) {
            System.out.println("文件不存在");
        }
        if (200 == number) {
            System.out.println("文件存在");
        }

        return blogMapper.queryByTitle(title);
    }


    /**
     * 添加博客
     *
     * @param blog 博客对象
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "添加博客", notes = "添加博客")
    public void add(@RequestBody Blog blog) {
        blogMapper.insert(blog);
    }


    /**
     * 更新博客
     * 该方法用于更新博客信息
     *
     * @param blog 需要更新的博客对象
     */
    @PutMapping(value = "/update")
    @ApiOperation(value = "更新博客", notes = "更新博客")
    public void update(@RequestBody Blog blog) {
        blogMapper.update(blog);
    }


    /**
     * 删除博客
     * 删除指定id的博客
     */
    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation(value = "删除博客", notes = "删除博客")
    public void delete(@PathVariable("id") Integer id) {
        blogMapper.delete(id);
    }


    @PostMapping(value = "/webhook/test")
    @ApiOperation(value = "测试webhook", notes = "测试webhook")
    public String webHook(@RequestBody Object obj) {
        System.out.println(String.format("str:%s", obj.toString()));
        return "test";
    }


}
