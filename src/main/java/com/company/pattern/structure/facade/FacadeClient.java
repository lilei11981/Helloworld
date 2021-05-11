package com.company.pattern.structure.facade;

/**
 * @author lilei
 * @date 2021-05-05 下午7:31
 * @apiNote
 */

public class FacadeClient {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
