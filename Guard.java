import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Gaurd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guard extends Actor
{
    /**
     * Act - do whatever the Gaurd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static Guard main;
    GreenfootImage guardImg;

    public Guard()
    {
        main=this;
        guardImg = new GreenfootImage(30,30);
        guardImg.setColor(Color.black);
        guardImg.fill();
        setImage(guardImg);
    }

    public void act() 
    {   
        walk();
        catchPrisoner();
    }  

    private int getPrisonerX()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getPrisoner().getX();
    }

    private int getPrisonerY()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getPrisoner().getY();
    }
    //calculate distance from prisoner
    private double distanceFromPrisoner()
    {
        double a = Math.pow(getPrisonerX() - getX(), 2);
        double b = Math.pow(getPrisonerY() - getY(), 2);
        double c = Math.sqrt(a + b);
        // if(c == 0)
        // {
            // return getPrisonerX() - getY();
        // }
        return c;
    }

    private void walk()
    {   
        MyWorld w = (MyWorld) getWorld();
        if(!w.getPrisoner().isInSight(this) || distanceFromPrisoner()>300 )
        {            
            randomWalking();
        }        
       else
        {
            followPrisoner();
        }

    }

    private void randomWalking()
    {
        if(isAtEdge())
            turn(79);
        if(Greenfoot.getRandomNumber(180)<40) {
            if(Greenfoot.getRandomNumber(2)<1) {
                turn(20); }
            else {
                turn(-20); }
        }
        move(1);
    }

    private void followPrisoner()
    {  
        turnTowards(getPrisonerX(),getPrisonerY());
        move(1);
    }

    public void catchPrisoner()
    {   
        if(isTouching(Prisoner.class)){
            //removeTouching(Prisoner.class);
            Greenfoot.stop(); 
        }
    }
}