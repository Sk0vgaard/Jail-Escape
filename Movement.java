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
        // Add your action code here.
    }    
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
    
        public void checkWall()
    {
        int x1=getX();
        int y1=getY();

        if(getOneIntersectingObject(Walls.class)==null)
        {
            
        }
        else
        {
            setLocation(x1+SPEED,y1);
        }

        if(getOneIntersectingObject(Walls.class)==null)
        {
            
        }
        else
        {
            setLocation(x1-SPEED,y1);
        }

        if(getOneIntersectingObject(Walls.class)==null)
        {

        }
        else
        {
            setLocation(x1,y1+SPEED);
        }

        if(getOneIntersectingObject(Walls.class)==null)
        {

        }
        else
        {
            setLocation(x1,y1-SPEED);
        }
    }
}
