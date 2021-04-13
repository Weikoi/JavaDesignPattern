package com.dm.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1 = colorFactory.getColor("Blue");
        color1.fill();
    }
}
