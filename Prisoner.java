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
    private boolean hasGun=false;
    int angle;
    
    //Constructor for the Prisoner class
    public Prisoner()
    {
        keysFound = 0;
        getImage().scale(40,40);
        main=this;   

    }
    
    public boolean hasGun()
    {
        return hasGun;
    }
    
    /**
     * Do whatever the Prisoner likes to do just now.
     */
    public void act()

    {
        walk();
        checkWall();
        pickUpGun();
        if (foundItem()) {
            pickUpItem();
        }
        if(Greenfoot.mouseClicked(null) && hasGun()==true)
        {
            Greenfoot.playSound("shoot.mp3");
            getWorld().addObject(new Bullet(angle+180), getX(), getY());
        }
        if(Greenfoot.mouseMoved(null))
        {
            angle = getRotationAngle(getX(), getY());
            
        }
        openDoor();        
    }
    //picks up gun from the ground, plays sound, removes gun
        private void pickUpGun()
    {
        if(isTouching(Pistol.class)){
        hasGun=true;
        Greenfoot.playSound("reload.mp3");
        removeTouching(Pistol.class);
    }
    }
    // Checks to see if the player have met the requriements to open the door
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
    
    //Checks if item is found
    public boolean foundItem()
    {
        AbstractItem item = (AbstractItem) getOneObjectAtOffset(0, 0, AbstractItem.class);
        return item != null;
    }
    //Checks if it is a key or a hint that is picked up
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
    
    //Checks to see if there is a wall class between the actors
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
