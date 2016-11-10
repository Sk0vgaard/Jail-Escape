import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends MyWorld
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World1()
    {
        super();
        Key key = new Key();
        Hint hint = new Hint();
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.

        addObject(getPrisoner(), 60, 440);
        // addObject(new Guard(), 50, 50);
        addObject(new Guard(), 700, 250);
        // addObject(new Guard(), 50, 400);
        addObject(new Door(new World2()), 780, 440);
        addObject(key, 720, 100);
        addObject(hint, 400, 400);

        // for(int i = 350; i < 450; i++)
        // {
        // addObject(new Key(), 550, i);
        // }

        QuizHandler handler = new QuizHandler("What is the only mammal that can fly?", "bat", "Mouse");
        setHandler(handler);
        topWalls();
        buttomWalls();
        leftWalls();
        rightWalls();
        middleWalls();
        cornerWalls();
        cornerWalls2();

        // for(int i = 0; i < 800; i=+30)
        // {
        // addObject(new Wall(), 485, i);
        // }
    }

    private void topWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall(),pos,15);
            pos = pos + 30;

        } while (pos <= 820);
    }

    private void buttomWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall(),pos,485);
            pos = pos + 30;

        } while (pos <= 820);
    }

    private void leftWalls()
    {
        int pos = 30;
        do
        {
            addObject(new Wall(),15,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void rightWalls()
    {
        int pos = 30;
        do
        {
            addObject(new Wall(),785,pos);
            pos = pos + 30;

        } while (pos <= 410);
    }

    private void middleWalls()
    {
        int pos = 150;
        do
        {
            addObject(new Wall(),385,pos);
            pos = pos + 30;

        } while (pos <= 300);
    }
    
        private void cornerWalls()
    {
        int pos = 380;
        do
        {
            addObject(new Wall(),140,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }
    
        private void cornerWalls2()
    {
        int pos = 0;
        do
        {
            addObject(new Wall(),pos,380);
            pos = pos + 30;

        } while (pos <= 60);
    }
}
