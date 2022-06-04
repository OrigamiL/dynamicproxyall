package com.weifang.impl;

import com.weifang.service.Service;

/**
 * @program:
 * @ClassName: SuperStarLiu
 * @version: 1.0
 * @description: 目标对象 实现业务接口中的功能，进行唱歌表演
 * @author: zhezhi
 * @create: 2022-06-03 17:30
 **/

public class SuperStarLiu implements Service {
    @Override
    public void sing() {
        System.out.println("我是刘德华，我正在唱歌！");
    }
}
