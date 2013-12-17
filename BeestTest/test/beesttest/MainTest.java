/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beesttest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Bart Janisse
 */
public class MainTest {
    
    static OmnivoorGedrag g;
    static Beest beest;
    
    public MainTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        g = new OmnivoorGedrag("omnivoor");
        beest = new Beest(g);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        g.eet(20);
        System.out.println(g.type);
    }
}