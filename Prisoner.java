import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prisoner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prisoner extends Actor
{   
    private int age;
    private int keysFound;
    private int dx=300;
    private int dy=200;
    private int stepsTaken;
    public static Prisoner main;
    

    public Prisoner()
    {
        keysFound = 0;
        main=this;
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
        else if (canMove()) {
            move();
        }
        
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
    // /**
     // * Turn left by 90 degrees.
     // */
    // public void turnRight()
    // {
        // turn(90);
    // }
        public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
        
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
        
        return !facingEdge;
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
        if (key != null) {
            // eat the leaf...
            getWorld().removeObject(key);
            keysFound = keysFound + 1; 
        }
    }
    // /**
     // * Set the direction we're facing. The 'direction' parameter must
     // * be in the range [0..3].
     // */
    // public void setDirection(int direction)
    // {
        // if ((direction >= 0) && (direction <= 3)) {
            // setRotation(direction * 90);
        // }
    // }
    /**
     * Act - do whatever the Prisoner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
/**
     * Move one step forward.
     */
    public void move()
    {
        setLocation(dx, dy);
        stepsTaken = stepsTaken +1;
    }    
        
 
        public void walk()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            dy-=2;
            if(Greenfoot.isKeyDown("a"))
        {
            dx+=-2;
            move(); 
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            dx+=2;
            move();
}
            move();
        }
        //wawdawdadawdawdawdawdwadawdwadawdawdawdawdawdawdawdawdawdawdawdawdawdawdawda
        else if (Greenfoot.isKeyDown("a"))
        {
            dx+=-2;
            if(Greenfoot.isKeyDown("s"))
            {
                 dy+=2; 
                 move();
            }
            move(); 
        }
        //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        else if (Greenfoot.isKeyDown("s"))
        {
            dy+=2; 
             if (Greenfoot.isKeyDown("d"))
        {
            dx+=2;
            move();
}
            move();
        }       
        //ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
        else if (Greenfoot.isKeyDown("d"))
        {
            dx+=2;
            move();
}
         //dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
}
}