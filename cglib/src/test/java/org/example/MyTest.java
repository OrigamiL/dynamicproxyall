package org.example;

import org.junit.Test;

/**
 * @program:
 * @ClassName: MyTest
 * @version: 1.0
 * @description:
 * @author: zhezhi
 * @create: 2022-06-04 13:56
 **/

public class MyTest {
    @Test
    public void testAgent() {
        SuperStarLiu liu = new SubSuperStarLiu();
        liu.sing();
    }
}
