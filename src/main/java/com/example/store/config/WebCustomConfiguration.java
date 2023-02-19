package com.example.store.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器的注册
 */
@Configuration
public class WebCustomConfiguration implements WebMvcConfigurer {

    // 配置跨域（这个会导致，走完拦截器还会走这边）第一种
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")   //允许跨域的域名，可以用*表示允许任何域名使用
                //暴露header中的其他属性给客户端应用程序
                //如果不设置这个属性前端无法通过response header获取到Authorization也就是token
                .exposedHeaders("Authorization")
                .allowCredentials(true) //带上cookie信息
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);

    }
}