import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loser extends MyWorld
{
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 500;
    private boolean soundHasPlayed = false;
    /**
     * Constructor for objects of class Loser.
     * 
     */
    public Loser()
    {
        GreenfootImage loser = new GreenfootImage("Loser.jpg");
        loser.scale(WORLD_WIDTH, WORLD_HEIGHT);
        setBackground(loser);
        Greenfoot.playSound("loser.mp3");
    }
    
        public void act()
    {
        String key = Greenfoot.getKey();
        if (!soundHasPlayed)
        {
            GreenfootSound sound = new GreenfootSound("loser.mp3");
            sound.play();
            soundHasPlayed = true;
        }
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new World1());
        }
    }
}
