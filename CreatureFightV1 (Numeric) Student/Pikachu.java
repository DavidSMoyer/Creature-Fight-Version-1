import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    public Pikachu(World world)
    {
        super(650,2);
        getImage().scale(150,100);
        world.addObject(getHealthBar(),100,25);
    }
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        final World playerWorld = getWorld();
        
        if (getHealthBar().getCurrent() <= 0)
        {
            getWorld().showText("Pikachu has fainted!",getWorld().getWidth()/2,getWorld().getHeight()/2+26);
            Greenfoot.delay(30);
        }
    }    
}
