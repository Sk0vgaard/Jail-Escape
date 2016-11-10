import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    
    //turns image around for all the time to make it more visible 
    int i = 0;
    public void turn()
    {
        setRotation(i);
        if(i==359)
            i=0;  
        i++;
    }

}
