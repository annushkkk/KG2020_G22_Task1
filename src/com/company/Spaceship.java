package com.company;

import java.awt.*;

public class Spaceship {
    int width;
    public Spaceship(int width){
        this.width=width;
    }
    public void paint(Graphics2D g, double x, double y){
        g.setColor(Color.WHITE);
        g.fillOval((int)x+3*width/8,(int)y-1*width/8,width/4,width/4);
        g.setColor(Color.green);
        g.fillArc((int)x, (int)y, width, width/2, 0, 180);
    }
}
