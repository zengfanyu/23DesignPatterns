package com.project.fanyuzeng.a23designpatterns.bridgingpatterns;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.abstraction.Image;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.concreteimplementor.LinuxOS;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.concreteimplementor.UnixOS;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.concreteimplementor.WindowsOS;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.refinedabstraction.BMPImage;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.refinedabstraction.GIFImage;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.refinedabstraction.JPGImage;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.refinedabstraction.PNGImage;

/**
 * @author: fanyuzeng on 2018/1/4 15:27
 */
public class Test {
    public static void main(String[] args) {

        Image image1=new JPGImage();
        image1.setOS(new WindowsOS());
        image1.praseFileIntoImage("e:/pic/image1");
        System.out.println("===============================");

        Image image2=new GIFImage();
        image2.setOS(new WindowsOS());
        image2.praseFileIntoImage("e:/pic/image2");
        System.out.println("===============================");

        Image image3=new BMPImage();
        image3.setOS(new LinuxOS());
        image3.praseFileIntoImage("e:/pic/image3");
        System.out.println("===============================");

        Image image4=new PNGImage();
        image4.setOS(new UnixOS());
        image4.praseFileIntoImage("e:/pic/image4");


    }
}
