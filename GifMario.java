import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GifMario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GifMario extends Actor
{
    GifImage myGif = new GifImage("mario3.gif");
    public int speed = 3;
    /**
     * Act - do whatever the GifMario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
   
}
