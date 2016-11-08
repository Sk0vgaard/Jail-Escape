import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public static int getPrisonerInitialX(){return 300;}
    public static int getPrisonerInitialY(){return 200;}
    public MyWorld()
    { 
        super(800, 500, 1); 

        Key key = new Key();

        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        
        addObject(new Prisoner(), 300, 200);
        addObject(new Guard(), 50, 50);
        addObject(new Guard(), 600, 400);
        addObject(new Guard(), 50, 400);
        addObject(key, 450, 50);
        addObject(counter, 100,40);

    }
    public Counter getCounter()
    {
        return counter;
    }
}