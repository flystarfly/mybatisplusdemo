package com.flystarfly.mybatisplusdemo.recursive;

/**
 * @author zhouzhiqing
 * @deacription 将 Fibonacci 序列中的最后两个元素求和来产生下一个元素。
 * @createTime 2020/4/26 2:13 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
public class RecursiveFibonacci {
    IntCall fib;

    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) { return fib.call(n); }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }
}