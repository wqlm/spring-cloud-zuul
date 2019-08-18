package com.wqlm.zuul.conifg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * 配置跨域
 * @author wqlm
 * @date 2019/8/18 12:58
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        //是否支持 cookie 跨域
        config.setAllowCredentials(true);

        // 原始域名列表
        config.setAllowedOrigins(Arrays.asList("*"));

        // 请求头列表
        config.setAllowedHeaders(Arrays.asList("*"));

        // 请求方法类型列表
        config.setAllowedMethods(Arrays.asList("*"));

        // 缓存时间,如果一段时间内，相同的跨域请求不再检查，单位30秒
        config.setMaxAge(30L);

        // 对所以路径使用 config 配置
        source.registerCorsConfiguration("/**",config);

        return new CorsFilter(source);
    }
}
