package com.dm.strategy;

/**
 * @author： Weikoi
 * @date： 2021/4/14 1:18
 * @desc：
 * @version: 1.0
 */

public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
