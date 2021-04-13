package com.dm.abstract_factory;

/**
 * @author： Weikoi
 * @date： 2021/4/13 21:30
 * @desc：
 * @version: 1.0
 */

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType){
        if(colorType==null){
            return null;
        }else if (colorType.equalsIgnoreCase("Red")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if(colorType.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }
}
