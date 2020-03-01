package com.springboot.test.one.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "INDEX接口", tags = "INDEX接口")
@RestController
@RequestMapping("index")
public class IndexController {

    @ApiOperation(value = "index返回信息", notes = "index返回信息", httpMethod = "POST")
    @PostMapping(value = "index")
    @ResponseBody
    public String index(){
        return "这是一个项目的开始。";
    }
}
