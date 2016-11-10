import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int keyHint = 0;
    
    
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Keys/hints : " + keyHint, 24, Color.GREEN, Color.BLACK));
    }    
    
    //Add key counts to the counter
    public void addKeyAndHint()
    {
        keyHint++;        
    }
}