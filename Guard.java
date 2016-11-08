import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Gaurd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guard extends Movement
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
    private int getPrisonerX(){return Prisoner.main.prisonerGetX();}
    private int getPrisonerY(){return Prisoner.main.prisonerGetY();}
    //calculate distance from prisoner
   private double distanceFromPrisoner(){
       
       return Math.sqrt((Prisoner.main.prisonerGetX()-getX())*(Prisoner.main.prisonerGetX()-getX())+(Prisoner.main.prisonerGetY()-getY())*(Prisoner.main.prisonerGetY()-getY()));
    
    }
    public void act() 
    {   
        walkingType();
        catchPrisoner();
    }  
    public int guardGetY()
    {
        return getX();
    }
    public int guardGetX()
    {
        return getY();
    }
    private void walkingType()
    {   
        if(distanceFromPrisoner()>300)
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