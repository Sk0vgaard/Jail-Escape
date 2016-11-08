import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prisoner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisoner extends Movement
{   

    private int keysFound;
    private int dx=MyWorld.getPrisonerInitialX();
    private int dy=MyWorld.getPrisonerInitialX();
    public static Prisoner main;


    public Prisoner()
    {
        keysFound = 0;
            main=this;   
    }
    /**
    * x and y getter
    */
    
        public int prisonerGetX(){
        return  getX();
       }
    
        public int prisonerGetY(){
        return  getY();
       }
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
            
            //keysFound = keysFound + 1; 
        }
    }
 /**
     * Move one step forward.
     */
    public void move()
    {
        setLocation(dx, dy);
        
    }    
    /**
     * Act - do whatever the Prisoner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private void doSomething()
    {
        
    }
 
        public void walk()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(2);
        }else if (Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(2);
                   }else if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(2);
                    }else if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(2);
}
}
}