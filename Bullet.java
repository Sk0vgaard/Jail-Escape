import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
/**
 * Bullet object. Kills enemies.
 * 
 * @author Alberto Bagundo
 * @version 1.0 Feb 12, 2011
 */
public class Bullet  extends Weapon
{
    private static GreenfootImage BulletImage;
    
    
    final int SPEED = 10;
    
    /**
     * Creates a bullet that moves towards the place the mouse is pointing.
     */
    public Bullet(int direction){
        BulletImage = new GreenfootImage(5,5);
        BulletImage.setColor(Color.blue);
        BulletImage.fill();
        setImage(BulletImage);  
        setRotation(direction+90);
    }

    /**
     * Act - Move trough the map until it encounters a Guard or gets out the map.
     * 
     */
    
    public void act() 
    {
        if(isAtEdge() || getOneIntersectingObject(Walls.class)!=null)
        {
            getWorld().removeObject(this);
        }
        
        else
        {
            move(SPEED);
        }
    }    
}