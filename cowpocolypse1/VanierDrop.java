import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VanierDrop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VanierDrop extends World
{

    /**
     * Constructor for objects of class VanierDrop.
     * 
     */
  
    public VanierDrop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        modifiedText("COWPOCALYPSE", 125,205);
        modifiedText1("Presented by:", 1,270);
        modifiedText2("Gideon Eleboda", 1,310);
        modifiedText2("Jean Charles Prince Byiringiro", 1,350);
        modifiedText2("Anthonyy Siggia", 1,390);
        
        
        
        
        
    }
    public void modifiedText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font = new Font(40);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
        
    }
     public void modifiedText1(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font = new Font(20);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
        
    }
     public void modifiedText2(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font = new Font(20);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
        
    }
    
    
    
}
