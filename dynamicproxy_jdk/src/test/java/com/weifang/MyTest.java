package com.weifang;

import com.weifang.impl.SuperStarLiu;
import com.weifang.impl.SuperStarZhou;
import com.weifang.proxy.ProxyFactory;
import com.weifang.service.Service;
import org.junit.Test;

/**
 * @program:
 * @ClassName: MyTest
 * @version: 1.0
 * @description:
 * @author: zhezhi
 * @create: 2022-06-04 09:45
 **/

public class MyTest {
    @Test
    public void testJdk(){
        ProxyFactory factory = new ProxyFactory(new SuperStarLiu());
        Service agent = (Service)factory.getAgent();
        agent.sing();
        System.out.println(agent.show(10));
    }
    @Test
    public void testJdk2(){
        ProxyFactory factory = new ProxyFactory(new SuperStarZhou());
        Service agent = (Service)factory.getAgent();
        agent.sing();
        System.out.println(agent.show(20));
    }
}
