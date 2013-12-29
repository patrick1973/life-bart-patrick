/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. 
 */
package Controllers;

import Models.Beest;
import Models.IGedrag;
import Models.SimulatieModel;
import Models.OmnivoorGedrag;
import Models.Plant;
import Views.MainViewFrame;

/**
 *
 * @author Bart Janisse
 */
public class SimulatieController  {

    
    SimulatieModel main;
    MainViewFrame view;
    Thread thread = new Thread();
    /**
     * 1 thread per beest of 1 thread per simulatie????
     */

    /**
     * @param args the command line arguments
     */
    public SimulatieController()
    {
        thread.start();
    }


}
