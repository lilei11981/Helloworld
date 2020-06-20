package com.company.innerclass.memberinnerclass;

/**
 * @author lilei
 * @date 2020-06-14 13:22
 * @apiNote
 */

public class Test {


}

class Outter {
    private Inner inner = null;

    public Outter() {

    }

    public Inner getInnerInstance() {
        if (inner == null)
            inner = new Inner();
        return inner;
    }

    class Inner {
        public Inner() {

        }
    }
}
