import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    GreenfootSound ice = new GreenfootSound("ice.mp3");
    public int speed = 1;
    public int vidas = 10;
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
    {
        movimento();
        acertarAlvo();
    }
    private int sTimer = 0;
    public void movimento(){
        
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("p") && (sTimer == 0)){
            
            sTimer ++;
            ice.play();
            getWorld().addObject(new Ice(), getX() - 100, getY() + 0);
        }
        else{
            if (!Greenfoot.isKeyDown("p")){
            sTimer = 0;
            }
        }
    }
    public void acertarAlvo(){
        
    Actor b = getOneIntersectingObject(Fire.class);
    
    if (b != null) {
    Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
    counter2.add(1);
    vidas -=1;
     getWorld().removeObject(b);
     } else if(vidas == 0 ){
        getWorld().removeObject(this); 
     }
    }
}

