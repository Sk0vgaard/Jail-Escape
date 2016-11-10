import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    private MyWorld nextWorld;
    //Lets the door know which world to enter
    public Door(MyWorld nextWorld)
    {
        this.nextWorld = nextWorld;
    }

    public MyWorld getNextWorld()
    {
        return nextWorld;
    }

    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }
}
