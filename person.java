import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       
    GreenfootImage image = getImage();

        // Modificar el tamaño de la imagen a 100 píxeles de ancho y 150 píxeles de alto
        image.scale(50, 20);
        
        // Establecer la imagen modificada
        setImage(image);
    }
}
