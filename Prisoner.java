import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
import java.awt.Color;
/*
 * Write a description of class Prisoner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisoner extends Actor
{
     /** Current speed */
    private double speed = 0;

    /** The location */
    private double altitude;
    

    private GreenfootImage prisoner;
   
    
    public Prisoner()
    {
        prisoner = new GreenfootImage(40,40);
        prisoner.setColor(Color.black);
        prisoner.fill();
        setImage(prisoner);
    }       

    public void act()
    {
        processKeys();

        setLocation(getX(), (int) (altitude));

    }

    /**
     * Lander has been added to the world.
     */
    public void addedToWorld(World world) 
    {
       
        altitude = getY();
    }
    
    /**
     * Handle keyboard input.
     */
    private void processKeys() 
    {
        if(Greenfoot.isKeyDown("down")) 
        {
           
        }
    }

    /**
     * Check if we are colliding with anything and take appropiate action.
    
    private void checkCollision() 
    {
        if (isLanding()) {
            setImage(rocket);
            moon.addObject(new Flag(), getX(), getY());
            Greenfoot.stop();
        } 
        else if (isExploding()) {
            moon.addObject(new Explosion(), getX(), getY());
            moon.removeObject(this);
        }
    }
    */
}