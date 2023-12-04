package cn.liq.blog;

import cn.liq.blog.configer.MyConf;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
public class ConfTest {


    @Resource
    private MyConf myConf;

    @Test
    public void myConfTest() {
        log.info("myConfTest:{}", myConf.toString());
    }

}
