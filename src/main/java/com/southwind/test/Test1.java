package com.southwind.test;

import com.southwind.utils.Cal;
import com.southwind.utils.Impl.CalImpl1;
import com.southwind.utils.MyInvocationHandler;

public class Test1 {
    public static void main(String[] args) {
        Cal cal = new CalImpl1();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal cal1 = (Cal) myInvocationHandler.bind(cal);
        cal1.add(1,1);
        cal1.sub(2,1);
        cal1.mul(3,4);
        cal1.div(5,1);
    }
}