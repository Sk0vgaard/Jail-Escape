import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends MyWorld
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4()
    {
        super();
        Key key = new Key();
        Hint hint = new Hint();

        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.

        addObject(getPrisoner(), 735, 470);
        addObject(new Guard(), 400, 60);
        addObject(new Guard(), 100, 200);
        addObject(new Guard(), 600, 400);
        addObject(new Guard(), 250, 350);
<<<<<<< HEAD
        addObject(new Door(new World5()), 790, 255);
=======
        addObject(new Door(new Winner()), 790, 255);
>>>>>>> origin/master

        addObject(key, 50, 450);
        addObject(hint, 450, 200);

<<<<<<< HEAD
        QuizHandler handler = new QuizHandler("What has a neck but no head","bottle","You drink from it");
=======
        QuizHandler handler = new QuizHandler("","","tissemand");
>>>>>>> origin/master
        setHandler(handler);

        topWalls();
        buttomWalls();
        leftWalls();
        rightWalls();
        rightWalls2();
        roomWalls();
        roomWalls2();
        roomWalls3();
        roomWalls4();
        roomWalls5();
    }
<<<<<<< HEAD
    
    /*
     * These methods are making the walls
     */
=======

>>>>>>> origin/master
    private void topWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),pos,15);
            pos = pos + 30;

        } while (pos <= 820);
    }

    private void buttomWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),pos,485);
            pos = pos + 30;

        } while (pos <= 690);
    }

    private void rightWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 210);
    }

    private void rightWalls2()
    {
        int pos = 300;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 510);
    }

    private void leftWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),15,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void roomWalls()
    {
        int pos = 120;
        do
        {
            addObject(new Wall2(),690,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void roomWalls2()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),pos,120);
            pos = pos + 30;

        } while (pos <= 120);
    }

    private void roomWalls3()
    {
        int pos = 220;
        do
        {
            addObject(new Wall2(),pos,120);
            pos = pos + 30;

        } while (pos <= 600);
    }

    private void roomWalls4()
    {
        int pos = 120;
        do
        {
            addObject(new Wall2(),400,pos);
            pos = pos + 30;

        } while (pos <= 300);
    }

    private void roomWalls5()
    {
        int pos = 400;
        do
        {
            addObject(new Wall2(),400,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }
}
