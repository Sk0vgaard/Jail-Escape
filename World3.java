import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends MyWorld
{
    
    

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()
    {
        Key key = new Key();
        
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        
        addObject(getPrisoner(), 200, 300);
        addObject(new Guard(), 50, 50);
        addObject(new Guard(), 600, 400);
        addObject(new Guard(), 50, 400);
        addObject(new Door(), 750, 450);
        addObject(key, 450, 50);
    }
    
    
    
    
}
