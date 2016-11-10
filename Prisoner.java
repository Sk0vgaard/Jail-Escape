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
<<<<<<< HEAD
    private static final String KEY_UP = "up";
    private static final String KEY_RIGHT = "right";
    private static final String KEY_DOWN = "down";
    private static final String KEY_LEFT = "left";
    private int keysFound;
    private int hintFound;
=======
    private static final String KEY_UP = "w";
    private static final String KEY_RIGHT = "d";
    private static final String KEY_DOWN = "s";
    private static final String KEY_LEFT = "a";
    private int keysFound;
>>>>>>> origin/master
    public static Prisoner main;
    private boolean touchedKey = false;

    public Prisoner()
    {
        keysFound = 0;
<<<<<<< HEAD
        getImage().scale(40,40);
        main=this;   

    }
    
=======
        main=this;   

    }
    /**
     * x and y getter
     */

>>>>>>> origin/master
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
<<<<<<< HEAD
=======
        // else if (canMove()) {
        // move();
        // }
>>>>>>> origin/master
        openDoor();        
    }

    public void openDoor()
<<<<<<< HEAD
    {   
        MyWorld world = (MyWorld) getWorld();
        Door door = (Door) getOneObjectAtOffset(0, 0, Door.class);
        if (door != null && hasKey() && world.getQuizHandler().isCorrectAnswer())
        { 
            Greenfoot.playSound("open_door_1.mp3");
            Greenfoot.delay(50);
            Greenfoot.setWorld(door.getNextWorld());
        }
=======
    {
        if(!touchedKey)
            touchedKey = getOneIntersectingObject(Key.class) != null;
        if (getOneIntersectingObject(Door.class) != null && touchedKey)
            Greenfoot.setWorld(new World3());
>>>>>>> origin/master
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

<<<<<<< HEAD
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

=======
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
>>>>>>> origin/master
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
<<<<<<< HEAD
=======

    private void doSomething()
    {

    }

    /**
     * checks which key is pressed and moves accordingly
     */
>>>>>>> origin/master
    private void walk()
    {
        int x = getX();
        int y = getY();
        //checks if key up is pressed
        if (Greenfoot.isKeyDown(KEY_UP))
        {
<<<<<<< HEAD
            y -= SPEED;
=======
            y-=SPEED;
>>>>>>> origin/master
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
<<<<<<< HEAD
            x -= SPEED;
            if(Greenfoot.isKeyDown(KEY_DOWN))
            {
                y += SPEED; 
=======
            x+=-SPEED;
            if(Greenfoot.isKeyDown(KEY_DOWN))
            {
                y+=SPEED; 
>>>>>>> origin/master
            }
        }

        else if (Greenfoot.isKeyDown(KEY_DOWN))
        {
<<<<<<< HEAD
            y += SPEED; 
            if (Greenfoot.isKeyDown(KEY_RIGHT))
            {
                x += SPEED;
            }
            else if (Greenfoot.isKeyDown(KEY_LEFT))
            {
                x -= SPEED;
=======
            y +=SPEED; 
            if (Greenfoot.isKeyDown(KEY_RIGHT))
            {
                x+=SPEED;
            }
            else if (Greenfoot.isKeyDown(KEY_LEFT))
            {
                x -=SPEED;
>>>>>>> origin/master
            }
        }       

        else if (Greenfoot.isKeyDown(KEY_RIGHT))
        {
<<<<<<< HEAD
            x += SPEED;
=======
            x+=SPEED;
>>>>>>> origin/master
        }
        move(x, y);

    }

<<<<<<< HEAD
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
=======
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
>>>>>>> origin/master
    }

}
