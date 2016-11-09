import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Prisoner prisoner;
    private Counter counter = new Counter();
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    { 
        super(800, 500, 1); 
        prisoner = new Prisoner();
        addObject(counter, 100,40);

    }
    public Counter getCounter()
    {
        return counter;
    }
    
    public Prisoner getPrisoner()
    {
        return prisoner;
    }
    
    /**
     * 
     */
    
    
    
}