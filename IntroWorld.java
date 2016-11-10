import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 500;
    /**
     * Constructor for objects of class IntroWorld.
     * 
     */
    public IntroWorld()
    {    
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        GreenfootImage intro = new GreenfootImage("Intro.png");
        intro.scale(WORLD_WIDTH, WORLD_HEIGHT);
        setBackground(intro);
    }

    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new World1());
        }
    }
}
