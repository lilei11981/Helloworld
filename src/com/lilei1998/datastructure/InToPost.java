package com.lilei1998.datastructure;

import java.io.IOException;

/**
 * Created by lilei on 2017/7/12.
 * 利用堆栈将中缀表达式转换为后缀表达式
 */
public class InToPost {
    private Stack theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);  // 构造器总是伴随着new操作一起调用
    }

    public static void main(String[] args) throws IOException {
        String input = "1+2*4/5-7+3/6";        // 声明输入字符串
        String output;
        InToPost theTrans = new InToPost(input);    // 实例化InToPost对象
        output = theTrans.doTrans();              // 调用doTrans()函数
        System.out.println("Postfix is " + output + '\n');
    }

    public String doTrans() {      // 定义doTrans方法
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }

        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    public void gotOper(char opThis, int prec1) {  // 定义gotOper方法，两个参数
        while (!theStack.isEmpty()) {          // 实例对象非空
            char opTop = theStack.pop();       // 出栈
            if (opTop == '(') {                // 判断
                theStack.push(opTop);
                break;
            } else {
                int prec2;                     //
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {     // 定义gotParen方法，返回值为空，参数为char类型
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    class Stack {               // 定义Stack类
        private int maxSize;     // 声明私有整型变量maxSize
        private char[] stackArray;   // 声明私有数组变量stackArray
        private int top;            // 声明私有整型变量top

        public Stack(int max) {     // 构造函数，没有返回值
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char i) {    // 压栈
            stackArray[++top] = i;
        }

        public char pop() {          // 出栈，先入后出
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {    // 检测数组是否为空
            return (top == -1);
        }
    }
}
