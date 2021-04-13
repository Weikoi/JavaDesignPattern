package com.dm.strategy;

/**
 * @author： Weikoi
 * @date： 2021/4/14 1:10
 * @desc：
 * @version: 1.0
 */

public class MultiplyStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("MultiplyStrategy");
        return num1*num2;
    }
}
