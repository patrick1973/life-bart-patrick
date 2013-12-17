/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beesttest;

/**
 *
 * @author Bart Janisse
 */
public class Leefgebied {

    public Leefgebied() {
        
        IGedrag g = new OmnivoorGedrag("");
        
        Beest beest = new Beest(g);
        
        beest.gedrag.eet(10);
    }
}
