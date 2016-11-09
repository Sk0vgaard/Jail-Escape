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
    private static final String KEY_UP = "w";
    private static final String KEY_RIGHT = "d";
    private static final String KEY_DOWN = "s";
    private static final String KEY_LEFT = "a";
    private int keysFound;
    public static Prisoner main;
    private boolean touchedKey = false;

    public Prisoner()
    {
        keysFound = 0;
        main=this;   

    }
    /**
     * x and y getter
     */

    /**
     * Do whatever the key likes to to just now.
     */
    public void act()

    {
        walk();
        if (foundKey()) {
            pickUpKey();
        }
        // else if (canMove()) {
        // move();
        // }
        openDoor();        
    }

    public void openDoor()
    {
        if(!touchedKey)
            touchedKey = getOneIntersectingObject(Key.class) != null;
        if (getOneIntersectingObject(Door.class) != null && touchedKey)
            Greenfoot.setWorld(new World3());
    }

    /**
     * Check whether there is a key in the same cell as we are.
     * Return true, if there is, false otherwise.
     */
    public boolean foundKey()
    {
        Actor key = getOneObjectAtOffset(0, 0, Key.class);
        return key != null;
    }

    /**
     * Pick up the key (if there is one in our cell).
     */
    public void pickUpKey()
    {
        Actor key = getOneObjectAtOffset(0, 0, Key.class);
        Actor hint = getOneObjectAtOffset(0, 0, Hint.class);
        if (key != null) {
            // picking up the key...

            World myWorld = getWorld();
            getWorld().removeObject(key);
            getWorld().removeObject(hint);
            MyWorld myworld = (MyWorld)myWorld;
            Counter counter = myworld.getCounter();
            counter.addKeys();
            touchedKey = true;
            keysFound++;
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
     * Act - do whatever the Prisoner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private void doSomething()
    {

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
            y-=SPEED;
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
            x+=-SPEED;
            if(Greenfoot.isKeyDown(KEY_DOWN))
            {
                y+=SPEED; 
            }
        }

        else if (Greenfoot.isKeyDown(KEY_DOWN))
        {
            y +=SPEED; 
            if (Greenfoot.isKeyDown(KEY_RIGHT))
            {
                x+=SPEED;
            }
            else if (Greenfoot.isKeyDown(KEY_LEFT))
            {
                x -=SPEED;
            }
        }       

        else if (Greenfoot.isKeyDown(KEY_RIGHT))
        {
            x+=SPEED;
        }
        move(x, y);

    }

    public boolean isInSight(Actor actor)
    {
        Actor a = Util.getFirstActorBetween(getWorld(), getX(), getY(), actor.getX(), actor.getY(), Key.class);
        if(a != null)
        {
            return false;            
            
        }
        return true;        
        
        
        
        // MyWorld m = (MyWorld) getWorld();    
        
        // Get horizontal distance between actor and prisoner
        // double x = actor.getX() - getX();
        // Get vertical distance between actor and prisoner
        // double y = actor.getY() - getY();
        // Calculates the slope of the "triangle" created by the two distances
        // double a = y / x;
        // double b = getY() - (a * getX());

        // double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // for(int i = Math.min(actor.getX(), getX()); i < Math.max(actor.getX(), getX()); i++)  
        // {
            // double actY = a * i + b;
            // if(m.getObjectsAt(i, (int) actY, Key.class) != null)
            // {
                // return false;
            // }            
        // }
        // return true;
    }

}
