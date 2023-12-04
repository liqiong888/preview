package cn.liq.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

import java.sql.Connection;
import java.sql.DriverManager;


@MapperScan({"cn.liq.blog"})
@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {

        //测试链接sqlite  测试代码扫描
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:blog.db", "hsp", "123456");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        SpringApplication.run(BlogApplication.class, args);
    }

}
