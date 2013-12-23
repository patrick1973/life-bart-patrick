/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Bart Janisse
 */
public class Wereld {

    Leefgebied leefgebied1;
    Leefgebied leefgebied2;
    
    public Wereld(int elementen) 
    {
        int planten = (int)(elementen * 0.3 / 2.0);
        int obstakels = (int)(elementen * 0.1 / 2.0);
        int carnivoren = (int)(elementen * 0.4 / 2.0);
        int omnivoren = (int)(elementen * 0.05 / 2.0);
        int herbivoren = (int)(elementen * 0.1 / 2.0);
        int nonivoren = (int)(elementen * 0.05 /2.0);
        
        leefgebied1 = new Leefgebied(obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren); 
        leefgebied2 = new Leefgebied(obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren); 
    }
    
}
