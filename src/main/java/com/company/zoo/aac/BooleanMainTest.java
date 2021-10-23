package com.company.zoo.aac;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author lilei
 * @date 2021-10-10 下午9:54
 * @apiNote
 */

public class BooleanMainTest {
    public static void main(String[] args) throws IOException {
        //定一个 Model3 类型
        Model3 model3 = new Model3();
        model3.setSuccess(true);
        //使用 fastjson(1.2.16)序列化 model3 成字符串并输出
        System.out.println("Serializable Result With fastjson :" + JSON.toJSONString(model3));
        //使用 Gson(2.8.5)序列化 model3 成字符串并输出
        Gson gson = new Gson();
        System.out.println("Serializable Result With Gson :" + gson.toJson(model3));
        //使用 jackson(2.9.7)序列化 model3 成字符串并输出
        ObjectMapper om = new ObjectMapper();
        System.out.println("Serializable Result With jackson :" + om.writeValueAsString(model3));
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

        public String getHollis() {
            return "hollischuang";
        }
    }
}

