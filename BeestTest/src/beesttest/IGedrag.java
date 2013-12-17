/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beesttest;

/**
 *
 * @author Bart Janisse
 */
public interface IGedrag {
    public String getType();
    public void eet(int hoeveelheid);
    public void eetPlant(Plant plant);
}
