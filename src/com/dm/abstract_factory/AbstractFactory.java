package com.dm.abstract_factory;

/**
 * @author： Weikoi
 * @date： 2021/4/13 21:26
 * @desc：
 * @version: 1.0
 */

public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
