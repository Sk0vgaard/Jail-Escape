import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prisoner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisoner extends Movement
{   
    private static final int SPEED = 2;
    private static final String KEY_UP = "up";
    private static final String KEY_RIGHT = "right";
    private static final String KEY_DOWN = "down";
    private static final String KEY_LEFT = "left";
    private int keysFound;
    private int hintFound;
    public static Prisoner main;
    private boolean touchedKey = false;

    public Prisoner()
    {
        keysFound = 0;
        getImage().scale(40,40);
        main=this;   

    }
    
    /**
     * Do whatever the key likes to to just now.
     */
    public void act()

    {
        walk();
        checkWall();
        if (foundItem()) {
            pickUpItem();
        }
        openDoor();        
    }

    public void openDoor()
    {   
        MyWorld world = (MyWorld) getWorld();
        Door door = (Door) getOneObjectAtOffset(0, 0, Door.class);
        if (door != null && hasKey() && world.getQuizHandler().isCorrectAnswer())
        { 
            Greenfoot.playSound("open_door_1.mp3");
            Greenfoot.delay(50);
            Greenfoot.setWorld(door.getNextWorld());
        }
    }

    /**
     * Check whether there is a key in the same cell as we are.
     * Return true, if there is, false otherwise.
     */
    public boolean foundItem()
    {
        AbstractItem item = (AbstractItem) getOneObjectAtOffset(0, 0, AbstractItem.class);
        return item != null;
    }

    public void pickUpItem()
    {
        MyWorld world = (MyWorld) getWorld();
        AbstractItem item = (AbstractItem) getOneObjectAtOffset(0, 0, AbstractItem.class);
        if (item != null) 
        {
            if(item.getClass() == Key.class)
            {
                keysFound++;
                Greenfoot.playSound("key.wav");
            }
            else if(item.getClass() == Hint.class)
            {
                hintFound++;
                Greenfoot.playSound("idea.wav");
            }
            item.pickup();       

        }
    }

    /**
     * Move one step forward.
     */
    public void move(int x, int y)
    {
        setLocation(x, y);
    }    

    /**
     * checks which key is pressed and moves accordingly
     */
    private void walk()
    {
        int x = getX();
        int y = getY();
        //checks if key up is pressed
        if (Greenfoot.isKeyDown(KEY_UP))
        {
            y -= SPEED;
            if(Greenfoot.isKeyDown(KEY_LEFT))
            {
                x -= SPEED;
            }
            else if (Greenfoot.isKeyDown(KEY_RIGHT))
            {
                x += SPEED;
            }
        }
        // checks if key left is pressed
        else if (Greenfoot.isKeyDown(KEY_LEFT))
        {
            x -= SPEED;
            if(Greenfoot.isKeyDown(KEY_DOWN))
            {
                y += SPEED; 
            }
        }

        else if (Greenfoot.isKeyDown(KEY_DOWN))
        {
            y += SPEED; 
            if (Greenfoot.isKeyDown(KEY_RIGHT))
            {
                x += SPEED;
            }
            else if (Greenfoot.isKeyDown(KEY_LEFT))
            {
                x -= SPEED;
            }
        }       

        else if (Greenfoot.isKeyDown(KEY_RIGHT))
        {
            x += SPEED;
        }
        move(x, y);

    }

    public boolean hasKey()
    {
        return keysFound > 0;
    }

    public boolean isInSight(Actor actor)
    {
        Actor a = Util.getFirstActorBetween(getWorld(), getX(), getY(), actor.getX(), actor.getY(), Walls.class);
        if(a != null)
        {
            return false;            

        }
        return true;        
    }

}
