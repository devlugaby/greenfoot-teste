import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("mario.mp3");
    
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo ()
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
        Luigi luigi = new Luigi();
        addObject(luigi,291,430);
        Mario mario = new Mario();
        addObject(mario,530,448);
        luigi.setLocation(405,452);
        luigi.setLocation(453,421);
        removeObject(luigi);
        removeObject(mario);
        addObject(luigi,132,431);
        addObject(mario,467,373);
        mario.setLocation(569,372);
        Counter counter = new Counter();
        addObject(counter,246,23);
        Counter2 counter2 = new Counter2();
        addObject(counter2,559,40);
    }
    public void act(){
       
    //Diálogo Luigi
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("lu1.jpg"));
    }
    //Diálogo Mário
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("ma1.jpg"));
    }
    //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
        Mundo world = new Mundo();
        Greenfoot.setWorld(world);
    }
}
}
