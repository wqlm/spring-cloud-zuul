package com.wqlm.zuul;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * 远端 git 配置更新之后,动态加载配置文件
 * @author wqlm
 * @date 2019/8/16 16:51
 */
@Component
public class ZuulConfig {

    @ConfigurationProperties("zuul")
    @RefreshScope
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
}
