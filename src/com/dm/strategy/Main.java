package com.dm.strategy;

/**
 * @author： Weikoi
 * @date： 2021/4/14 1:11
 * @desc：
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        Context cxt = new Context(new AddStrategy());
        int result = cxt.executeStrategy(12,10);
        System.out.println("result: " + result);
    }
}
