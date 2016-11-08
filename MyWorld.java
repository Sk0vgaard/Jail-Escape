import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1500x800 cells with a cell size of 1x1 pixel.        
        super(800, 500, 1); 
        
        // Create a new Prisoner and set screen location.
        Prisoner prisoner = new Prisoner();
        //Guard guard = new Guard();
        Key key = new Key();
        
        // Adding prisoner, key and counter object and setting screen location.
        addObject(prisoner, 50, 450);
        //addObject(guard, 500, 500);
        addObject(key, 750, 50);
        addObject(counter, 100,40);
               
    }
    
    public Counter getCounter()
    {
        return counter;
    }
   
}