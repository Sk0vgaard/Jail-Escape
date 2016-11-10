import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movement extends Actor
{
    private static final int SPEED = 2;
    /**
     * Act - do whatever the Movement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    //checks if next step is going to set object location into wall, if it is it doesnt let it to. Works better for Guard
            public void blockWalls()
    {   
        
        int x1=getX();
        int y1=getY();
        int x2;
        int y2;
        if(getOneIntersectingObject(Walls.class)==null)
        {
           x2=getX();
        }
        else
        {
        x2=getOneIntersectingObject(Walls.class).getX();
        }
        if(getOneIntersectingObject(Walls.class)==null)
        {
           y2=getY();
        }
        else
        {
        y2=getOneIntersectingObject(Walls.class).getY();
        }
        if(x1>(x2+15))
        {
            setLocation(x1+SPEED,y1);
        }
        else if(x1<(x2-15))
        {
            setLocation(x1-SPEED,y1);
        }
         if(y1>(y2+15))
        {
            setLocation(x1,y1+SPEED);
        }
        else if(y1<(y2-15))
        {
            setLocation(x1,y1-SPEED);
        }
    }
        //checks if next step is going to set object location into wall, if it is it doesnt let it to. Works better for Prisoner
        public void checkWall()
    {
        int x1=getX();
        int y1=getY();

        if(getOneIntersectingObject(Walls.class)!=null)
        {
            setLocation(x1+SPEED,y1);
        }

        if(getOneIntersectingObject(Walls.class)!=null)

        {
            setLocation(x1-SPEED,y1);
        }

        if(getOneIntersectingObject(Walls.class)!=null)
        {
            setLocation(x1,y1+SPEED);
        }

        if(getOneIntersectingObject(Walls.class)!=null)
        {
            setLocation(x1,y1-SPEED);
        }
    }
   // returns the angle between object and mouse pointer
        public int getRotationAngle(int x, int y)
    {
        int angle = 1;
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int dx = x - mouse.getX();
        int dy = y - mouse.getY();
        double angleRad = Math.atan2(dy, dx);
        angle = (int) Math.round(Math.toDegrees(angleRad)) - 90;
        
        
        return angle;
    }
   
        public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    //checks whether object is at edge of the world or not
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
            
        else
            return false;
    }
}
