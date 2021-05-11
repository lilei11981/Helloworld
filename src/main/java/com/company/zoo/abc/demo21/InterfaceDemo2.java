package com.company.zoo.abc.demo21;

/**
 * @author lilei
 * @date 2020-08-13 14:25
 * @apiNote
 */

public interface InterfaceDemo2 {
    default void method1() {
        System.out.println("默认实现2");
    }
}
