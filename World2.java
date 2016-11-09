import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends MyWorld
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {
        Key key = new Key();

        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        
        addObject(getPrisoner(), 500, 400);
        // addObject(new Guard(), 50, 50);
        addObject(new Guard(), 600, 400);
        // addObject(new Guard(), 50, 400);
        addObject(new Door(), 750, 450);
        addObject(key, 550, 400);
        
        for(int i = 350; i < 450; i++)
        {
            addObject(new Key(), 550, i);
        }
    }
}
