package com.briup.studenttest.web.controller;

import com.briup.studenttest.bean.Student;
import com.briup.studenttest.util.Message;
import com.briup.studenttest.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class addstudent {
    @GetMapping("/test01")
    @ApiOperation(value ="添加学生")
    public  String test05(String name,int age){
        System.out.println("name"+name);
        System.out.println("age"+age);
        return "成功";

    }
    @ApiOperation(value ="添加学生")
    @PostMapping("/test02")
    public Message add(){

        return MessageUtil.success("添加成功");


    }
    @GetMapping("/test03")
    @ApiOperation(value ="删除学生")
    @ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int")
    public Message Delete(int stuid){

        return  MessageUtil.success();

    }
    @GetMapping("/test04")
    @ApiOperation(value ="删除学生")
    //@ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int")
    @ApiImplicitParams({@ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value = "学生姓名",paramType = "query",dataType = "String")})
    public Message Delete1(int stuid,String name){

        return  MessageUtil.success();

    }
    @GetMapping("/test05")
    @ApiOperation(value ="删除学生")
    //@ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int")
   // @ApiImplicitParams({@ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int",required = true),
          //  @ApiImplicitParam(name = "name",value = "学生姓名",paramType = "query",dataType = "String")})
    public Message Delete1(Student student){

        return  MessageUtil.success();

    }

}
