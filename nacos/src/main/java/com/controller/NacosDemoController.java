package com.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/18
 */
@RestController
@EnableSwagger2
@Api(value = "测试接口", description = "测试接口")
public class NacosDemoController {


  @GetMapping("/hello")
  @ApiOperation("hello的测试接口")
  public String hello(@RequestParam String name) {
    return "hello " + name;
  }


}
