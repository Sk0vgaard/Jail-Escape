
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gaurd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guard extends Movement
{
    private int width;
    private int height;
    private int dx;
    private Guard tracking;
    
    /**
     * Act - do whatever the Gaurd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Guard(int width, int height, Guard tracking)
    {
        this.width = width;
        this.height = height;
        this.tracking = tracking;
        dx = 1;
    }
    
    public void act() 
    {
        tryChangeDirection();
        setLocation(tracking.getX(), getY());
        //setLocation(getX(), getY() + 1);
        
        if (foundPrisoner());
        destroyPrisoner();
    }    
    private void tryChangeDirection()
    {
        if(getX() + width/2 >= getWorld().getWidth() || getX() - width/2 <= 0)
        {
            //Change our 'x' direction to the inverted direction:
            dx = dx * -1;
        }
    }
    public boolean foundPrisoner()
    {
        Actor prisoner = getOneObjectAtOffset(0, 0, Prisoner.class);
        return prisoner != null;
    }
    public void destroyPrisoner()
    {
        Actor prisoner = getOneObjectAtOffset(0, 0, Prisoner.class);
        if (prisoner != null) {
            getWorld().removeObject(prisoner);
            
        }
        
    }
}