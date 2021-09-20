package com.southwind.utils.Impl;

import com.southwind.utils.Cal;

public class CalImpl implements Cal {

    public int add(int num1, int num2) {
        System.out.println("add 方法的参数：" + num1 + "," + num2);
        int result = num1 + num2;
        System.out.println("add 方法的结果 = " + result);
        return result;
    }

    public int sub(int num1, int num2) {
        System.out.println("sub 方法的参数：" + num1 + "," + num2);
        int result = num1 - num2;
        System.out.println("sub 方法的结果 = " + result);
        return result;
    }

    public int mul(int num1, int num2) {
        System.out.println("mul 方法的参数：" + num1 + "," + num2);
        int result = num1 * num2;
        System.out.println("mul 方法的结果 = " + result);
        return result;
    }

    public int div(int num1, int num2) {
        System.out.println("div 方法的参数：" + num1 + "," + num2);
        int result = num1 / num2;
        System.out.println("div 方法的结果 = " + result);
        return result;
    }
}
