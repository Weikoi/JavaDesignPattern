package com.dm.proxy;

/**
 * @author： Weikoi
 * @date： 2021/4/16 0:53
 * @desc：
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("Gakki.jpeg");
        image.display();

        System.out.println("");

        image.display();
    }
}
