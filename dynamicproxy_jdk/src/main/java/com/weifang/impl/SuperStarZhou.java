package com.weifang.impl;

import com.weifang.service.Service;

/**
 * @program:
 * @ClassName: SuperStarZhou
 * @version: 1.0
 * @description:
 * @author: zhezhi
 * @create: 2022-06-04 09:29
 **/

public class SuperStarZhou implements Service {
    @Override
    public void sing() {
        System.out.println("周在唱歌 。。。。");
    }
    @Override
    public String show(int age) {
        System.out.println("周的show。。。。"+age);
        return "zhou";
    }
}
