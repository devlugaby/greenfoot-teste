import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win2 extends World
{
   private int atraso = 500;
    /**
     * Constructor for objects of class win2.
     * 
     */
    public win2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
     public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (atraso == 0){
         Credits world = new Credits();
         Greenfoot.setWorld(world);
        }
}
}
