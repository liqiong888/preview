package cn.liq.blog.entity;

import lombok.Data;


@Data
public class Blog {
    private Integer id;
    private String title;
    private String author;
    private String content;
    private Long create_time;
    private Long update_time;
}
