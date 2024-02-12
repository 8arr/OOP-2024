package ie.tudublin;

import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import processing.core.PApplet;

public class MultiSensoryFoLoopExperience extends PApplet {

    int mode = 0;

    Minim minim;
    AudioOutput out;

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        colorMode(HSB);
    }

    float offs = 0;

    public void draw()
    {
        background(0);
        stroke(255);
        offs += 1f;
        switch(mode)
        {
            case 0:
                for (int i = 0; i<10; i++)
                {
                    stroke(i*17, 255, 255);
                    fill(i*17, 255, 255);
                    rect(0 + (i * width/ 10.0f), 0, (width/10.0f), height);
                }
                break;
            case 1:
                for (int i = 0 ; i < 10 ; i ++)
                {
                    //code

                }
                break;
            default:
                // Code goes here
                break;
        }
    }

    public void keyPressed()
    {
        
        if (key >= '0' && key <= '9')
        {
            mode = key - '0';
        }
    }
    
}
