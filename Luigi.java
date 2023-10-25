import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Luigi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Luigi extends Actor
{
    GreenfootSound fire = new GreenfootSound("fire.mp3");
    public int speed = 1;
    public int vidas = 10;
    /**
     * Act - do whatever the Luigi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
    {
        movimento();
        acertarAlvo();// Add your action code here.
    }
    private int sTimer = 0;
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("l") && (sTimer == 0)){
            
            sTimer ++;
            fire.play();
            fire.setVolume(100);
            getWorld().addObject(new Fire(), getX() + 150, getY() + 0);
        }
        else{
            if (!Greenfoot.isKeyDown("l")){
                sTimer = 0;
            }
        }
    }
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(Ice.class);
    
    if (b != null) {
    Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
    counter.add(1);
    vidas -=1;
     getWorld().removeObject(b);
     } else if(vidas == 0 ){
        getWorld().removeObject(this); 
     }
    }
}

