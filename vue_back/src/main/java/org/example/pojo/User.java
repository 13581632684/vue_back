package org.example.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("用户信息")
public class User {
    private String username;
    private String password;
}
