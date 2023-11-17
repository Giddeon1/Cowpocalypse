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
        modifiedText("Vanier Project", 200,100);
        modifiedText1("Presented by:", 1,250);
        modifiedText2("Gideon Eleboda", 1,310);
        modifiedText2("P", 1,350);
        modifiedText2("A", 1,390);
        
        
        
        
        
    }
    public void modifiedText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font = new Font(40);
        bg.setFont(font);
        bg.setColor(Color.RED);
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
