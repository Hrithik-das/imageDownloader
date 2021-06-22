package com.company;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.UUID;


public class importImage {

    public static void main(String[] args){
        Scanner readme = new Scanner(System.in);
        BufferedImage image =null;
        System.out.println("Enter Your URL here");
        String user = readme.nextLine();
        String numAsString = UUID.randomUUID().toString();
        String path = "C:\\Users\\"+ System.getProperty("user.name") + "\\Downloads\\"+ numAsString+".jpg";
        try{
            URL pic = new URL(user);
            image=ImageIO.read(pic);
            ImageIO.write(image,"jpg",new File(path));
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
