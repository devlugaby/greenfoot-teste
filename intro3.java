import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro3 extends intro2
{
    private int atraso = 50;
    /**
     * Constructor for objects of class intro3.
     * 
     */
    public intro3()
    {
    }
    public void act()
    {
    {
        if(atraso>0){
            atraso--;
        }
        else if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
         Mundo world = new Mundo();
         Greenfoot.setWorld(world);
        }
    }
}
}