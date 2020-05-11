package aop_1.impl;

import aop_1.Calculator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyMathCal  {
//    @Override
    public int add(int i, int j) {
        return i+j;
    }

//    @Override
    public int sub(int i, int j) {
        return i-j;
    }

//    @Override
    public int mul(int i, int j) {
        return i*j;
    }

//    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
