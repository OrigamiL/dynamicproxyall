package com.weifang.impl;

import com.weifang.service.Service;

/**
 * @program:
 * @ClassName: SuperStarZhou
 * @version: 1.0
 * @description: 目标对象
 * @author: zhezhi
 * @create: 2022-06-03 17:50
 **/

public class SuperStarZhou implements Service {
    @Override
    public void sing() {
        System.out.println("我是周润发，我正在表演");
    }
}
