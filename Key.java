import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends AbstractItem
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    //Shows the question and answer label when it is picked up
    public void pickup()
    {

        MyWorld world = (MyWorld) getWorld();
        world.getQuizHandler().showQuestionLabel(world);
        world.getQuizHandler().showAnswerLabel(world);
        super.pickup();
    }
}
