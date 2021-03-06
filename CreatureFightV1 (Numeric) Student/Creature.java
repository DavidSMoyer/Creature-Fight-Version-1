import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends Actor
{
    private HealthBar creatureBar;
    
    private int healthNumber;
    
    public int playerOwnership;
    
    /**
     * Default constructor for objects of the Creature class
     * 
     * @param There are no parameters
     * @return an object of the Creature class
     */
    public Creature()
    {
        healthNumber = 500;
        playerOwnership = 0;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
    }

    /**
     * Constructor that allows customization of objects of the Creature class
     * 
     * @param health is the amount of health the Creature object will have
     * @param whichPlayer discusses whether the creature belongs to player 1 or player 2
     * @return an object of the Creature class
     */
    public Creature( int health, int whichPlayer )
    {
        healthNumber = health;
        playerOwnership = whichPlayer;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
    }
    
    /**
     * attack is the code that is run when the Creature attacks its enemy
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void attack()
    {
        //empty method that will get overriden in subclasses
    }
    
    /**
     * act will complete actions that the Creature object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        //empty method that will get overriden in subclasses
    } 
    /**
     * Get the health bar of the creature.
     * 
     * @param None There are no parameters.
     * @return Returns the health bar.
     */
    protected HealthBar getHealthBar()
    {
        return creatureBar;
    }
    /**
     * Get the player who owns the creature.
     * 
     * @param None There are no parameters.
     * @return Returns the player that owns the creature.
     */
    public int getPlayerOwner()
    {
        return playerOwnership;
    }
}
