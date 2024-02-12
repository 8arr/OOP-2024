package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {

    }

    float x1, y1, x2, y2;
    float x1dir, x2dir, y1dir, y2dir;
    float c = 0;

    public void draw()
    {
        background(0, 0, 255); // rgb
        stroke(0, 255, 0);
        line (10, 10, 100, 100); // x1, y1, x2, y2
        ellipse(200, 90, 80, 200); // cx, cy, w, h
        circle(200, 300, 80);
        fill(255, 255, 0); // rgb
        rect(400, 380, 50, 100); // x, y, w, h
        triangle(10, 200, 200, 300, 400);

    }
}