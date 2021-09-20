package com.southwind.test;

import com.southwind.utils.Cal;
import com.southwind.utils.Impl.CalImpl;

public class Test {
    public static void main(String[] args) {
        Cal cal = new CalImpl();
        cal.add(1,1);
        cal.sub(2,1);
        cal.mul(3,4);
        cal.div(5,1);
    }
}
