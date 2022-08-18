import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.ThreadLocalRandom;


public class enemy01 extends Actor
{
    int d = 1;
    int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
    int velocidade = randomNum;
    public void act(){
        int y = getY();
        int x = getX();
        
        if (y > 570){d=0;}
        if (y < 30){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
            velocidade = randomNum;
            d=1;}
        
        if (d==1){moveDown();}
        if (d==0){moveUp();}
        
        
        Actor sapo;
        sapo = getOneIntersectingObject(perereca.class);
        if (sapo !=null){
            World MyWorld;
            MyWorld = getWorld();
            //MyWorld.removeObject(sapo);
            int point = perereca.pontos;
            System.out.print("Você perdeu!\nPontuação: "+point+"\n");
            Greenfoot.stop();
        }
    }
    public void moveDown(){
        int y = getY();
        int x = getX();
        y = y+velocidade;
        setLocation(x,y);
    }                
    public void moveUp(){
        int y = getY();
        int x = getX();
        y = y-velocidade;
        setLocation(x,y);
    } 
}
