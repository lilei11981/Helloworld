package com.company.datastructure;

import java.io.IOException;

/**
 * Created by lilei on 2017/7/13.
 * 利用压栈出栈的方法来实现字符串的反转
 */
public class StringReverseThroughStack {
    private String input;

    private StringReverseThroughStack(String in) {       // 参数化构造函数用于为不同对象提供不同初始化的值
        input = in;
    }

    public static void main(String[] args) throws IOException {     // main()函数
        String input = "company.com";     // 初始化字符串
        String output;
        StringReverseThroughStack theReverse = new StringReverseThroughStack(input);   // 实例化StringReverseThroughStack对象
        output = theReverse.doRev();             // 调用doRev()函数
        System.out.println("反转前：" + input);
        System.out.println("反转后：" + output);
    }

    private String doRev() {           // 定义执行字符串反转的函数
        int stackSize = input.length();      // 声明整型变量stackSize为初始化字符串的长度
        Stack theStack = new Stack(stackSize);   // 实例化Stack对象
        for (int i = 0; i < input.length(); i++) {     // 依次推入字符串的各个字符值
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        StringBuilder output = new StringBuilder();
        while (!theStack.isEmpty()) {     // 判断字符串值为非空
            char ch = theStack.pop();     // 依次推出字符串各个字符
            output.append(ch);         // 合并
        }
        return output.toString();                   // 返回反转后的字符串
    }

    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        Stack(int max) {      // 构造函数
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        void push(char i) {      // 定义push()函数
            stackArray[++top] = i;
        }

        char pop() {            // 定义pop()函数
            return stackArray[top--];
        }

        public char peek() {            // 定义peek()函数
            return stackArray[top];
        }

        boolean isEmpty() {        // 定义isEmpty()函数
            return (top == -1);
        }
    }
}
