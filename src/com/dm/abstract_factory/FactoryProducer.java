package com.dm.abstract_factory;

/**
 * @author： Weikoi
 * @date： 2021/4/13 21:43
 * @desc：
 * @version: 1.0
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice==null){
            return null;
        }
        if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }else if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
