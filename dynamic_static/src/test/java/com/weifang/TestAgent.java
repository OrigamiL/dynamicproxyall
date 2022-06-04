package com.weifang;

import com.weifang.impl.Agent;
import com.weifang.impl.SuperStarLiu;
import com.weifang.impl.SuperStarZhou;
import com.weifang.service.Service;
import org.junit.Test;

/**
 * @program:
 * @ClassName: TestAgent
 * @version: 1.0
 * @description: test
 * @author: zhezhi
 * @create: 2022-06-03 17:36
 **/

public class TestAgent {
    @Test
    public void testAgent(){
        Service service = new Agent(new SuperStarLiu());
        service.sing();
        Service service1 = new Agent(() -> System.out.println("我在唱歌嘿嘿"));
        service1.sing();
    }
}
