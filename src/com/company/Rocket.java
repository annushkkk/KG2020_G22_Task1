package com.company;

import java.awt.*;

public class Rocket {
    int width,height;
    public Rocket(int width,int height){
        this.height=height;
        this.width=width;
    }
   public void paint(Graphics2D g, int x, int y){
        g.setColor(Color.darkGray);
       g.rotate(Math.toRadians(25));
        g.fillRect(x,y,width,height);
       g.setColor(Color.RED);
        g.fillPolygon(new int[]{x, x + (width / 2),x+width}, new int[]{y, y -width/2, y},3);
       g.fillPolygon(new int[]{x, x,x-width/2}, new int[]{y+height, y +height/2, y+height},3);
       g.fillPolygon(new int[]{x+width, x+width,x+3*width/2}, new int[]{y+height, y +height/2, y+height},3);
       g.drawLine(x,y+height/2,x+width,y+height/2);
       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(x+2*width/7,y+height/12,3*width/7,3*width/7);
       g.rotate(Math.toRadians(-25));

   }
}
