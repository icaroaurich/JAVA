import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.ThreadLocalRandom;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        //addObject​(new floresta(),400,300); // x , y
        SpawMosca();
        
        addObject​(new perereca(),100, 500); // x , y
        addObject​(new enemy01(),100, 30); // x , y
        addObject​(new enemy01(),200, 30); // x , y
        addObject​(new enemy01(),300, 30); // x , y
        addObject​(new enemy01(),400, 30); // x , y
        addObject​(new enemy01(),500, 30); // x , y
        addObject​(new enemy01(),600, 30); // x , y
        addObject​(new enemy01(),700, 30); // x , y
        
        addObject (new moita(),180,20);
        addObject (new moita(),400,20);
        addObject (new moita(),600,20);
        
    }
    public void SpawMosca(){
        int randomNumX = ThreadLocalRandom.current().nextInt(100, 700);
        int randomNumY = ThreadLocalRandom.current().nextInt(100, 500);
        addObject (new mosca(),randomNumX,randomNumY);
    }
}
