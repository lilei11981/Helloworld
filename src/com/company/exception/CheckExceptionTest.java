package com.company.exception;

import java.sql.SQLException;

/**
 * Created by lilei on 2017/11/6 上午10:16.
 */
public class CheckExceptionTest {
    public static void main(String[] args) {
        doThrow(new SQLException());
    }

    static void doThrow(Exception e) {
        CheckExceptionTest.<RuntimeException>doThrowDemo(e);
    }

    @SuppressWarnings("unchecked")
    static <E extends Exception> void doThrowDemo(Exception e) throws E {
        throw (E) e;
    }
}
