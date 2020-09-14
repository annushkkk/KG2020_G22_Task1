package com.company;

import java.awt.*;

public class Star{
    int n;
    double r, R;
    Color color;

    public Star(int n, Color color, double r, double R) {
        this.n = n;
        this.color = color;
        this.r = r;
        this.R = R;
    }

    public void paint(Graphics2D g, double x, double y) {

        int nPoints = n * 2 + 1;

        int xPoint[] = new int[nPoints];
        int yPoint[] = new int[nPoints];
        for (int i = 0; i < nPoints; i++) {
            double iRadius = (i % 2 == 0) ? R : r;
            double angle = (i * 360.0) / (2 * n);

            xPoint[i] = (int) (x + iRadius * Math.cos(Math.toRadians(angle - 90)));
            yPoint[i] = (int) (y + iRadius * Math.sin(Math.toRadians(angle - 90)));
        }
        g.setColor(color);
        g.fillPolygon(xPoint, yPoint, nPoints);
    }

}

