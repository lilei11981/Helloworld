package com.company.zoo.aac;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author lilei
 * @date 2021-10-10 下午9:54
 * @apiNote
 */

public class BooleanMainTest1 {
    public static void main(String[] args) throws IOException {
        Model3 model3 = new Model3();
        model3.setSuccess(true);
        Gson gson = new Gson();
        System.out.println(gson.fromJson(JSON.toJSONString(model3), Model3.class));
    }

    static class Model3 implements Serializable {
        private static final long serialVersionUID = 1836697963736227954L;
        private boolean isSuccess;

        public boolean isSuccess() {
            return isSuccess;
        }

        public void setSuccess(boolean success) {
            isSuccess = success;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Model3.class.getSimpleName() + "[", "]")
                    .add("isSuccess=" + isSuccess)
                    .toString();
        }
    }
}

