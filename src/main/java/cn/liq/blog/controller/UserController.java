package cn.liq.blog.controller;

import cn.liq.blog.mapper.UserMapper;
import cn.liq.blog.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    /**
     * 添加用户
     *
     * @param user 要添加的用户对象
     * @return 成功添加用户返回用户ID，出现异常返回异常信息
     */
    @PostMapping(value = "/add")
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public String addUser(@RequestBody User user) {
        try {
            userMapper.insertUser(user);
            return "success";
        } catch (Exception e) {
            return e.getMessage();

        }

    }

    @PostMapping(value = "/update")
    @ApiOperation(value = "更新用户", notes = "更新用户")
    public String updateUser(@RequestBody User user) {
        try {
            userMapper.updateUser(user);
            return "success";
        } catch (Exception e) {
            return e.getMessage();

        }

    }

    /**
     * 删除用户
     *
     * @param user 要删除的用户对象
     * @return 删除结果，成功返回"success"，失败返回异常信息
     */
    @PostMapping(value = "/delete")
    @ApiOperation(value = "删除用户", notes = "删除用户")
    public String deleteUser(@RequestBody User user) {
        try {
            userMapper.deleteUser(user.getId());
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    /**
     * 查询用户信息
     * 根据用户名查询用户信息，并返回用户信息的字符串表示
     *
     * @param user 请求体中的User对象，包含用户名信息
     * @return 用户信息的字符串表示，若发生异常则返回异常信息
     */
    @GetMapping(value = "/query")
    @ApiOperation(value = "查询用户", notes = "查询用户")
    public List<User> queryUser(@RequestBody User user) {
        try {
            List<User> users = userMapper.queryUser(user.getUsername());
            return users;
        } catch (Exception e) {
            return new ArrayList<User>();
        }
    }


    /**
     * 查询所有用户信息
     *
     * @return 所有用户信息的字符串表示
     */
    @GetMapping(value = "/queryAll")
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    public String queryAll() {
        try {
            List<User> queryAll = userMapper.queryAll();
            return queryAll.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
