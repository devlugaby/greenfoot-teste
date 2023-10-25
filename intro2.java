import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro2 extends Intro1
{
    private int atraso = 50;
    /**
     * Constructor for objects of class intro2.
     * 
     */
    public intro2()
    {
    }
    public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
         intro3 world = new intro3();
         Greenfoot.setWorld(world);
        }
    }
}
