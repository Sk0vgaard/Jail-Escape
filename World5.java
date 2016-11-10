import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends MyWorld
{

    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5()
    {
        super();
        Key key = new Key();
        Hint hint = new Hint();

        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.

        addObject(getPrisoner(), 15, 250);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Guard(), 500, 230);
        addObject(new Pistol(), 730, 55);
        addObject(new Door(new Winner()), 790, 350);

        addObject(key, 730, 450);

        QuizHandler handler = new QuizHandler("modeerf","freedom","");
        setHandler(handler);

        topWalls();
        buttomWalls();
        rightWalls();
        rightWalls2();
        leftWalls();
        leftWalls2();
        roomWalls();
        roomWalls2();
        roomWalls3();
        roomWalls4();
    }

    /*
     * These methods are making the walls
     */
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

    private void rightWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 300);
    }

    private void rightWalls2()
    {
        int pos = 400;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void leftWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),15,pos);
            pos = pos + 30;

        } while (pos <= 210);
    }

    private void leftWalls2()
    {
        int pos = 300;
        do
        {
            addObject(new Wall2(),15,pos);
            pos = pos + 30;

        } while (pos <= 510);
    }

    private void roomWalls()
    {
        int pos = 100;
        do
        {
            addObject(new Wall2(),150,pos);
            pos = pos + 30;

        } while (pos <= 400);
    }

    private void roomWalls2()
    {
        int pos = 150;
        do
        {
            addObject(new Wall2(),pos,100);
            pos = pos + 30;

        } while (pos <= 820);
    }

    private void roomWalls3()
    {
        int pos = 240;
        do
        {
            addObject(new Wall2(),300,pos);
            pos = pos + 30;

        } while (pos <= 510);
    }

    private void roomWalls4()
    {
        int pos = 400;
        do
        {
            addObject(new Wall2(),pos,400);
            pos = pos + 30;

        } while (pos <= 820);
    }
}
