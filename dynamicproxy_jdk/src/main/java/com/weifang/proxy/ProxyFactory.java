package com.weifang.proxy;

import com.weifang.service.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program:
 * @ClassName: ProxyFactory
 * @version: 1.0
 * @description: 代理工厂
 * @author: zhezhi
 * @create: 2022-06-04 09:33
 **/

public class ProxyFactory {
     Service target;

    public ProxyFactory(Service target) {
        this.target = target;
    }

    public Object getAgent() {

        return Proxy.newProxyInstance(
                //ClassLoader loader 类加载器
                target.getClass().getClassLoader(),
                //Class<?>[] interface 目标对象实现的接口
                target.getClass().getInterfaces(),
                //InvocationHandler h
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //创建代理对象传入
                            Object proxy,
                            //目标方法 sing();show();
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        //代理功能
                        System.out.println("预定时间。。。。。。");
                        System.out.println("预定场地。。。。。。");
                        //主业务实现功能
                        Object obj = method.invoke(target, args);
                        //代理功能
                        System.out.println("结算费用。。。。。。");

                        return obj;
                    }
                }
        );
    }
}
