package org.example;

/**
 * @program:
 * @ClassName: SubSuperStarLiu
 * @version: 1.0
 * @description:
 * @author: zhezhi
 * @create: 2022-06-04 13:54
 **/

public class SubSuperStarLiu extends SuperStarLiu{
    @Override
    public void sing() {
        System.out.println("预定时间");
        System.out.println("预定场地");
        super.sing();
        System.out.println("结算费用");
    }
}
