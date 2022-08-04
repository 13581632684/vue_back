package org.example.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Api(tags = "用户信息")
@RestController
@SuppressWarnings("all")
@CrossOrigin(origins = {"*", "null"})

public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Value("${pattern.dateformat}")
    private String dateformat;

    @GetMapping("/now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }
    @PostMapping("/login")
    @ApiOperation("登录")
    public String loginStudent(@RequestBody User user){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.setEntity(user);
        User userselect = userMapper.selectOne(userQueryWrapper);
        if (userselect == null){
            return "0";
        }
        return "1";
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public void registerStudent(@RequestBody User user){
        userMapper.insert(user);
    }

}
