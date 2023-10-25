import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro1 extends World
{
    private int atraso = 50;
    /**
     * Constructor for objects of class Intro1.
     * 
     */
    public Intro1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
    public void act()
    {
        if(atraso>0){
            atraso--;
        }
        else if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
         intro2 world = new intro2();
         Greenfoot.setWorld(world);
        }
    }
}