package com.dm.abstract_factory;

/**
 * @author： Weikoi
 * @date： 2021/4/13 21:25
 * @desc：
 * @version: 1.0
 */

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("fill red...");
    }
}
