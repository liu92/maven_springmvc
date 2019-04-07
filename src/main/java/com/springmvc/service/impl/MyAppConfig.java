package com.springmvc.service.impl;

import com.springmvc.service.HelloSevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyAppConfig
 * Description: 测试注解类，采用注解形式
 * Date:     2019/3/27 23:34
 * History:
 * <version> 1.0
 * @author lin
 */
@Configuration
public class MyAppConfig {

    /**
     * 功能描述: 采用注解形式将 方法的放回值注入到容器中去，容器中这个组件默认的id就是方法名
     *
     *
     */

    @Bean
    public HelloSevice helloSevice(){
        return  new HelloSevice();
    }
}
