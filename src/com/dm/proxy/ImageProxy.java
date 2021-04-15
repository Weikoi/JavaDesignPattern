package com.dm.proxy;

/**
 * @author： Weikoi
 * @date： 2021/4/16 0:50
 * @desc：
 * @version: 1.0
 */

public class ImageProxy implements Image{

    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
