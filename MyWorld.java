import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
<<<<<<< HEAD
    Counter counter = new Counter();
    private Prisoner prisoner;
    private QuizHandler handler;
=======
    private Prisoner prisoner;
    private Counter counter = new Counter();
    

>>>>>>> origin/master
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    { 
        super(800, 500, 1); 
        prisoner = new Prisoner();
        addObject(counter, 100,40);

    }

    public Counter getCounter()
    {
        return counter;
    }
<<<<<<< HEAD

=======
    
>>>>>>> origin/master
    public Prisoner getPrisoner()
    {
        return prisoner;
    }
<<<<<<< HEAD

    public QuizHandler getQuizHandler()
    {
        return handler;
    }

    public void setHandler(QuizHandler handler)
    {
        this.handler = handler;
    }

=======
    
    /**
     * 
     */
    
    
    
>>>>>>> origin/master
}