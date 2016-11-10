import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hint extends AbstractItem
{
    /**
     * Act - do whatever the Hint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    //When picked up it shows the hint label in the gameworld
    public void pickup()
    {
        MyWorld world = (MyWorld) getWorld();
        world.getQuizHandler().showHintLabelInWorld(world);   
        super.pickup();
        
    }
}
