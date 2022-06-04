package com.weifang.impl;

import com.weifang.service.Service;

/**
 * @program:
 * @ClassName: Agent
 * @version: 1.0
 * @description: 代理对象
 * @author: zhezhi
 * @create: 2022-06-03 17:32
 **/

public class Agent implements Service {

    public Service target;

    public Agent(Service target){
        this.target = target;
    }
    @Override
    public void sing() {
        System.out.println("预定时间");
        System.out.println("预定场地");
        //业务功能必须由目标对象亲自实现
       /*SuperStarLiu liu = new SuperStarLiu();
        liu.sing();
        SuperStarZhou zhou = new SuperStarZhou();
        zhou.sing();*/
        //面向接口编程，必须接口指向实现类（规范）
        target.sing();
        System.out.println("结算费用");
    }
}
