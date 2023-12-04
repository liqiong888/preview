package cn.liq.blog.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String sex;
    private int age;
    private Long createTime;
    private Long updateTime;
}
