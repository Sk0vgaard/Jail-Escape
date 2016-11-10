import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends MyWorld
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {
        super();
        Key key = new Key();
        Hint hint = new Hint();
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.

        addObject(getPrisoner(), 20, 440);
        addObject(new Guard(), 100, 100);
        addObject(new Guard(), 600, 400);
        // addObject(new Guard(), 50, 400);
        addObject(new Door(new World3()), 780, 315);
        addObject(key, 700, 100);
        addObject(hint, 350, 400);

        QuizHandler handler = new QuizHandler("What is the only mammal that can fly?", "bat", "Mouse");
        setHandler(handler);

        topWalls();
        buttomWalls();
        leftWalls();
        rightWalls();
        rightWalls2();
        roomWalls();
        roomWalls2();
        roomWalls3();

    }

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

        } while (pos <= 820);
    }

    private void leftWalls()
    {
        int pos = 30;
        do
        {
            addObject(new Wall2(),15,pos);
            pos = pos + 30;

        } while (pos <= 410);
    }

    private void rightWalls()
    {
        int pos = 30;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 270);
    }

    private void rightWalls2()
    {
        int pos = 360;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void roomWalls()
    {
        int pos = 190;
        do
        {
            addObject(new Wall2(),270,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void roomWalls2()
    {
        int pos = 270;
        do
        {
            addObject(new Wall2(),pos,190);
            pos = pos + 30;

        } while (pos <= 450);
    }

    private void roomWalls3()
    {
        int pos = 570;
        do
        {
            addObject(new Wall2(),pos,190);
            pos = pos + 30;

        } while (pos <= 800);
    }
}

