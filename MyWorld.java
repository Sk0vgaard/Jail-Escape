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
<<<<<<< HEAD
=======
=======
    private Prisoner prisoner;
    private Counter counter = new Counter();
    

>>>>>>> origin/master
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
<<<<<<< HEAD
    /*
     *
     */
=======

>>>>>>> origin/master
    public Counter getCounter()
    {
        return counter;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> origin/master
>>>>>>> origin/master
    public Prisoner getPrisoner()
    {
        return prisoner;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

    public QuizHandler getQuizHandler()
    {
        return handler;
    }

    public void setHandler(QuizHandler handler)
    {
        this.handler = handler;
    }

<<<<<<< HEAD
=======
=======
    
    /**
     * 
     */
    
    
    
>>>>>>> origin/master
>>>>>>> origin/master
}