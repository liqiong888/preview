package cn.liq.blog.configer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "my")
public class MyConf {

    private String var1;

    private String var2;
}
