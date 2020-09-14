package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    public void paint(Graphics g) {
        Random random = new Random();
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK);
        gr.fillRect(0,0,800,700);
        Star starBig=new Star(4,Color.magenta,25,50);
        for(int i=0;i<3;i++){
            starBig.paint(gr,random.nextInt(800),random.nextInt(700));
        }
        starBig.paint(gr,100,150);
        Star starMedium=new Star(4,Color.YELLOW,15,30);

        for(int i=0;i<7;i++){
            starMedium.paint(gr,random.nextInt(800),random.nextInt(700));
        }
        Star starSmall=new Star(4,Color.white,5,15);
        for(int i=0;i<35;i++){
            starSmall.paint(gr,random.nextInt(800),random.nextInt(700));
        }
        Rocket rocket = new Rocket(100,200);
        rocket.paint(gr,450,100);
        Spaceship spaceship = new Spaceship(200);
        spaceship.paint(gr,550,150);


    }

}
