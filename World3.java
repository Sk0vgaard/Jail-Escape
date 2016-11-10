import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends MyWorld
{

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()

    {
        super();
        Key key = new Key();
        Hint hint = new Hint();

        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.

        addObject(getPrisoner(), 15, 315);
        addObject(new Guard(), 50, 50);
        addObject(new Guard(), 600, 100);
        addObject(new Guard(), 400, 350);
        addObject(new Door(new World4()), 735, 5);
        addObject(key, 200, 50);
        addObject(hint, 740, 450);

        QuizHandler handler = new QuizHandler("","","tissemand");
        setHandler(handler);

        topWalls();
        buttomWalls();
        leftWalls();
        leftWalls2();
        rightWalls();
        roomWalls();
        roomWalls2();
        roomWalls3();
        roomWalls4();
    }

    private void topWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),pos,15);
            pos = pos + 30;

        } while (pos <= 690);
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

        } while (pos <= 270);
    }

    private void leftWalls2()
    {
        int pos = 360;
        do
        {
            addObject(new Wall2(),15,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void rightWalls()
    {
        int pos = 0;
        do
        {
            addObject(new Wall2(),785,pos);
            pos = pos + 30;

        } while (pos <= 500);
    }

    private void roomWalls()
    {
        int pos = 15;
        do
        {
            addObject(new Wall2(),pos,270);
            pos = pos + 30;

        } while (pos <= 150);
    }

    private void roomWalls2()
    {
        int pos = 240;
        do
        {
            addObject(new Wall2(),pos,270);
            pos = pos + 30;

        } while (pos <= 570);
    }

    private void roomWalls3()
    {
        int pos = 670;
        do
        {
            addObject(new Wall2(),pos,270);
            pos = pos + 30;

        } while (pos <= 800);
    }

    private void roomWalls4()
    {
        int pos = 30;
        do
        {
            addObject(new Wall2(),400,pos);
            pos = pos + 30;

        } while (pos <= 270);
    }
}
