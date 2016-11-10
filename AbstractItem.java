import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractItem extends Actor
{
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void pickup()
    {            
        MyWorld myworld = (MyWorld) getWorld();
        Counter counter = myworld.getCounter();
        counter.addKeyAndHint();
        myworld.removeObject(this);
    }

}
