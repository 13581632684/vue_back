package org.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("学生信息")
public class Student {

    @ApiModelProperty("学生id")
    private long id;

    @ApiModelProperty("学生学号")
    private String number;

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty("学生年龄")
    private int age;

    @ApiModelProperty("学生语文成绩")
    private  int chinese;

    @ApiModelProperty("学生数学成绩")
    private int math;

    @ApiModelProperty("学生英语成绩")
    private int english;

}
