package com.dm.proxy;


import com.dm.strategy.Strategy;

/**
 * @author： Weikoi
 * @date： 2021/4/16 0:46
 * @desc：
 * @version: 1.0
 */

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(this.filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.filename);
    }
}
