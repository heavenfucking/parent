package com.zhh;

import com.zzh.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhuhao on 2018/2/2
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/spring-core.xml"}) //加载配置文件
public class SpringTest {

    @Autowired
    private RedisUtil redisUtil;



    @Test
    public void t1(){
        redisUtil.set("name", "zhuhao2354254");
    }




}
