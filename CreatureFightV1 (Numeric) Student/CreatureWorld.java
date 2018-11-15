/**
 * TODO (50): Fill out the following information...
 * 
 * Name: David Scott Moyer
 * Course: Software Development
 * Teacher: Scott Hardman
 * Date Last Modified: 11/7/2018
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureWorld extends World
{
    private Creature playerOneCreature;
    private Creature playerTwoCreature;
    
    /**
     * Default constructor for objects of class CreatureWorld.
     * 
     * @param There are no parameters
     * @return an object of class CreatureWorld
     */
    public CreatureWorld()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
       
        playerOneCreature = new Charmander(this);
        playerTwoCreature = new Pikachu(this);
        
        prepareCreatures();
        
        Greenfoot.start();
    }
    
    /**
     * act will complete actions that the CreatureWorld object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        List allObjects = getObjects(null);

        if (playerOneCreature.getHealthBar().current <= 0)
        {
            removeObjects(allObjects);
            showText("Player Two Wins.",getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
        if(playerTwoCreature.getHealthBar().current <= 0)
        {
            removeObjects(allObjects);
            showText("Player One Wins.",getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    private void prepareCreatures()
    {
        addObject(playerOneCreature,playerOneCreature.getImage().getWidth()/2,getHeight()-playerOneCreature.getImage().getHeight()/2);
        addObject(new Button(Color.RED,50),getWidth()/2,getHeight()-100);
        
        addObject(playerTwoCreature,getWidth()-playerTwoCreature.getImage().getWidth()/2,playerTwoCreature.getImage().getHeight()/2);
        addObject(new Button(Color.RED,50),getWidth()/2,100);
    }
    public Creature getPlayerOne()
    {
        return playerOneCreature;
    }
    public Creature getPlayerTwo()
    {
        return playerTwoCreature;
    }
}
