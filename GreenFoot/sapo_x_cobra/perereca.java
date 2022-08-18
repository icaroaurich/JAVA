import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.ThreadLocalRandom;

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perereca extends Actor
{
    static int pontos = 0;
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int y = getY();
        int x = getX();
        
        //if (Greenfoot.isKeyDown("w")){setRotation(270);move(5);}
        //if (Greenfoot.isKeyDown("s")){setRotation(90);move(5);}
        //if (Greenfoot.isKeyDown("a")){setRotation(180);move(5);}
        //if (Greenfoot.isKeyDown("d")){setRotation(0);move(5);}
                
        if (Greenfoot.isKeyDown("a")){x = x-5;}
        if (Greenfoot.isKeyDown("d")){x = x+5;}
        if (Greenfoot.isKeyDown("w")){y = y-5;}
        if (Greenfoot.isKeyDown("s")){y = y+5;}
        setLocation(x,y);
        
        
        Actor mosca;
        mosca = getOneIntersectingObject(mosca.class);
        if (mosca !=null){
            World MyWorld;
            MyWorld = getWorld();
            MyWorld.removeObject(mosca);
            pontos++;
            SpawMosca();
        }
    }
    public void SpawMosca(){
        
        World MyWorld;
        MyWorld = getWorld();
        //MyWorld.removeObject(sapo);
        //Greenfoot.stop();
            
        int randomNumX = ThreadLocalRandom.current().nextInt(100, 700);
        int randomNumY = ThreadLocalRandom.current().nextInt(100, 500);
        MyWorld.addObject (new mosca(),randomNumX,randomNumY);
        }
}
