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
    Counter counter = new Counter();
    private Prisoner prisoner;
    private QuizHandler handler;
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

    public Prisoner getPrisoner()
    {
        return prisoner;
    }

    public QuizHandler getQuizHandler()
    {
        return handler;
    }

    public void setHandler(QuizHandler handler)
    {
        this.handler = handler;
    }

}