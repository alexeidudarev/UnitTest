package com.example.alexeidudarev.unittest;

public class SimpleMath {
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
    public int div(int num, int by){
        if(by == 0) return 0;
        return num/by;
    }
    public int div2(int num, int by)throws ArithmeticException {
        return num/by;
    }
}
