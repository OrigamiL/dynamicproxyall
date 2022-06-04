package com.weifang.impl;

import com.weifang.service.Service;

/**
 * @program:
 * @ClassName: SuperStarLiu
 * @version: 1.0
 * @description:
 * @author: zhezhi
 * @create: 2022-06-04 09:28
 **/

public class SuperStarLiu implements Service {
    @Override
    public void sing() {
        System.out.println("刘在唱歌。。。。。。");
    }

    @Override
    public String show(int age) {
        System.out.println("刘的show。。。。"+age);
        return "liu";
    }
}
