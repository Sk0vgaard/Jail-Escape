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
<<<<<<< HEAD
        getImage().scale(30,30);
=======
<<<<<<< HEAD
        getImage().scale(40,40);
        // guardImg = new GreenfootImage(30,30);
        // guardImg.setColor(Color.black);
        // guardImg.fill();
        // setImage(guardImg);
=======
        guardImg = new GreenfootImage(30,30);
        guardImg.setColor(Color.black);
        guardImg.fill();
        setImage(guardImg);
>>>>>>> origin/master
>>>>>>> origin/master
    }

    public void act() 
    {   
        walk();
<<<<<<< HEAD
        blockWalls();
        catchPrisoner();
        tryToDie();
    }
    //checks if guard should dissapear, if true - plays the sound, removes bullet and guard
    private void tryToDie()
    {
        if(isTouching(Bullet.class))
        {
            Greenfoot.playSound("death.mp3");
            removeTouching(Bullet.class);
            getWorld().removeObject(this);
        }
    }
    //returns x position of prosiner
    private int getPrisonerX()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getPrisoner().getX();
    }
    //returns y position of prosiner
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
        return c;
    }
    //decides if guard should move randomly or follow prisoner
    private void walk()
    {   
        MyWorld w = (MyWorld) getWorld();
        if(!w.getPrisoner().isInSight(this) || distanceFromPrisoner()>200 )
        {            
            randomWalking();
        }        
        else
=======
<<<<<<< HEAD
        blockWalls();
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
        if(!w.getPrisoner().isInSight(this) || distanceFromPrisoner()>150 )
=======
        if(!w.getPrisoner().isInSight(this) || distanceFromPrisoner()>300 )
>>>>>>> origin/master
        {            
            randomWalking();
        }        
       else
>>>>>>> origin/master
        {
            followPrisoner();
        }

    }
<<<<<<< HEAD
    //method responsiblke for randon walking 
=======

>>>>>>> origin/master
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
<<<<<<< HEAD
    //method responsible for following the prisoner
=======

>>>>>>> origin/master
    private void followPrisoner()
    {  
        turnTowards(getPrisonerX(),getPrisonerY());
        move(1);
    }
<<<<<<< HEAD
    //sets new world Loser() if prisoner get touched by guard
    public void catchPrisoner()
    {   
        if(isTouching(Prisoner.class)){
            Greenfoot.setWorld(new Loser());
=======

    public void catchPrisoner()
    {   
        if(isTouching(Prisoner.class)){
            //removeTouching(Prisoner.class);
<<<<<<< HEAD
            Greenfoot.setWorld(new Loser());
=======
            Greenfoot.stop(); 
>>>>>>> origin/master
>>>>>>> origin/master
        }
    }
}