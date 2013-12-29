/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Observable;

/**
 *
 * @author Bart Janisse
 */
public class SimulatieModel extends Observable 
{     
    private Wereld wereld;
     
    public SimulatieModel() 
    {
        
    }
    
    public Wereld getWereld()
    {
        return this.wereld;
    }
    
    public void setWereld(Wereld w)
    {
        this.wereld = w;
        
        this.setChanged();
        this.notifyObservers(w);
    }
    
}
