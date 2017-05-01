/*
 * Copyright (C) 2017 hux
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Queueing;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author hux
 */
public class FileAttenteMMSTest {

    public FileAttenteMMSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of init method, of class FileAttenteMMS.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        FileAttenteMMS instance = new FileAttenteMMS();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculdRho method, of class FileAttenteMMS.
     */
    @Test
    public void testCalculdRho() {
        System.out.println("calculdRho");
        FileAttenteMMS instance = new FileAttenteMMS();
        instance.calculdRho();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conditions method, of class FileAttenteMMS.
     */
    @Test
    public void testConditions() {
        System.out.println("conditions");
        FileAttenteMMS instance = new FileAttenteMMS();
        boolean expResult = false;
        boolean result = instance.conditions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculProbabiliteJ method, of class FileAttenteMMS.
     */
    @Test
    public void testCalculProbabiliteJ() {
        System.out.println("calculProbabiliteJ");
        int dJ = 0;
        FileAttenteMMS instance = new FileAttenteMMS();
        double expResult = 0.0;
        double result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculNombreMoyenClientDansLaFile method, of class
     * FileAttenteMMS.
     */
    @Test
    public void testCalculNombreMoyenClientDansLaFile() {
        System.out.println("calculNombreMoyenClientDansLaFile");
        FileAttenteMMS instance = new FileAttenteMMS();
        instance.calculNombreMoyenClientDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculDureeSejourDsLeSys method, of class FileAttenteMMS.
     */
    @Test
    public void testCalculDureeSejourDsLeSys() {
        System.out.println("calculDureeSejourDsLeSys");
        double t = 0.0;
        FileAttenteMMS instance = new FileAttenteMMS();
        double expResult = 0.0;
        double result = instance.calculDureeSejourDsLeSys(t);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculProbabiliteTemps method, of class FileAttenteMMS.
     */
    @Test
    public void testCalculProbabiliteTemps() {
        System.out.println("calculProbabiliteTemps");
        int iEtat = 0;
        FileAttenteMMS instance = new FileAttenteMMS();
        double expResult = 0.0;
        double result = instance.calculProbabiliteTemps(iEtat);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
