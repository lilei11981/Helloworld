package com.company.pattern.structure.proxy;

/**
 * @author lilei
 * @date 2021-05-05 下午7:20
 * @apiNote 真实主题
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
