package com.config;

import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:hujc
 * @description:
 * @date: 2020/7/2
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .pathMapping("/")
        .select()
        .apis(RequestHandlerSelectors.any())
        .apis(RequestHandlerSelectors.basePackage("com.controller"))
        .build();
  }

  //构建api文档的详细信息函数
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("nacos学习-api文档")
        .contact(new Contact("hujc", "", ""))
        .version("1.0")
        .description("API 描述")
        .build();
  }
}