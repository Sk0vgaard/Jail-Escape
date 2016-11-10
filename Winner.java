import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends MyWorld
{
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 500;
    private boolean soundHasPlayed = false;
    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
    {
        GreenfootImage winner = new GreenfootImage("winner.jpg");
        winner.scale(WORLD_WIDTH, WORLD_HEIGHT);
        setBackground(winner);
    }

    /*
     * Makes the winner sound once 
     */
    public void act()
    {
        String key = Greenfoot.getKey();
        if (!soundHasPlayed)
        {
            GreenfootSound sound = new GreenfootSound("winner.mp3");
            sound.play();
            soundHasPlayed = true;
        }
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new World1());
        }
    }
}
