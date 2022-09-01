package com.emall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author SiKun
 * @date 2021/10/18/ 20:29
 */


@Configuration

public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，动态配置当项目处于test、dev环境时显示swagger，处于prod时不显示
                .enable(true)
                // 配置分组名称
                .groupName("EMall")
                // 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .select()
                //为当前包下controller生成API文档
                .apis(RequestHandlerSelectors.basePackage("com.emall.controller"))
                /*
                为有@Api注解的Controller生成API文档
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                为有@ApiOperation注解的方法生成API文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                */
                //配置如何通过path过滤
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("EMallTeam", "https://github.com/psikun/Emall", "psikun@foxmail.com");
        return new ApiInfoBuilder()
                .title("EMall")
                .description("易商城")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
