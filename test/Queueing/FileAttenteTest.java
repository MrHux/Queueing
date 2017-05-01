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
public class FileAttenteTest {

    public FileAttenteTest() {
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
     * Test of init method, of class FileAttente.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        FileAttente instance = new FileAttenteImpl();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dLambda method, of class FileAttente.
     */
    @Test
    public void testDLambda() {
        System.out.println("dLambda");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.dLambda();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dMu method, of class FileAttente.
     */
    @Test
    public void testDMu() {
        System.out.println("dMu");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.dMu();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getiNbClient method, of class FileAttente.
     */
    @Test
    public void testGetiNbClient() {
        System.out.println("getiNbClient");
        FileAttente instance = new FileAttenteImpl();
        int expResult = 0;
        int result = instance.getiNbClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getiNbServer method, of class FileAttente.
     */
    @Test
    public void testGetiNbServer() {
        System.out.println("getiNbServer");
        FileAttente instance = new FileAttenteImpl();
        int expResult = 0;
        int result = instance.getiNbServer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdLambda method, of class FileAttente.
     */
    @Test
    public void testSetdLambda() {
        System.out.println("setdLambda");
        double dLambda = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdLambda(dLambda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdMu method, of class FileAttente.
     */
    @Test
    public void testSetdMu() {
        System.out.println("setdMu");
        double dMu = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdMu(dMu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setiNbClient method, of class FileAttente.
     */
    @Test
    public void testSetiNbClient() {
        System.out.println("setiNbClient");
        int iNbClient = 0;
        FileAttente instance = new FileAttenteImpl();
        instance.setiNbClient(iNbClient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setiNbServer method, of class FileAttente.
     */
    @Test
    public void testSetiNbServer() {
        System.out.println("setiNbServer");
        int iNbServer = 0;
        FileAttente instance = new FileAttenteImpl();
        instance.setiNbServer(iNbServer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdL method, of class FileAttente.
     */
    @Test
    public void testSetdL() {
        System.out.println("setdL");
        double dL = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdL(dL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdLq method, of class FileAttente.
     */
    @Test
    public void testSetdLq() {
        System.out.println("setdLq");
        double dLq = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdLq(dLq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdRho method, of class FileAttente.
     */
    @Test
    public void testSetdRho() {
        System.out.println("setdRho");
        double dRho = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdRho(dRho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdW method, of class FileAttente.
     */
    @Test
    public void testSetdW() {
        System.out.println("setdW");
        double dW = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdW(dW);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdWq method, of class FileAttente.
     */
    @Test
    public void testSetdWq() {
        System.out.println("setdWq");
        double dWq = 0.0;
        FileAttente instance = new FileAttenteImpl();
        instance.setdWq(dWq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdLambda method, of class FileAttente.
     */
    @Test
    public void testGetdLambda() {
        System.out.println("getdLambda");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdLambda();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdMu method, of class FileAttente.
     */
    @Test
    public void testGetdMu() {
        System.out.println("getdMu");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdMu();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdRho method, of class FileAttente.
     */
    @Test
    public void testGetdRho() {
        System.out.println("getdRho");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdRho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculdRho method, of class FileAttente.
     */
    @Test
    public void testCalculdRho() {
        System.out.println("calculdRho");
        FileAttente instance = new FileAttenteImpl();
        instance.calculdRho();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculProbabiliteJ method, of class FileAttente.
     */
    @Test
    public void testCalculProbabiliteJ() {
        System.out.println("calculProbabiliteJ");
        int dJ = 0;
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdL method, of class FileAttente.
     */
    @Test
    public void testGetdL() {
        System.out.println("getdL");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdL();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdLq method, of class FileAttente.
     */
    @Test
    public void testGetdLq() {
        System.out.println("getdLq");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdLq();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdW method, of class FileAttente.
     */
    @Test
    public void testGetdW() {
        System.out.println("getdW");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdW();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdWq method, of class FileAttente.
     */
    @Test
    public void testGetdWq() {
        System.out.println("getdWq");
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.getdWq();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conditions method, of class FileAttente.
     */
    @Test
    public void testConditions() {
        System.out.println("conditions");
        FileAttente instance = new FileAttenteImpl();
        boolean expResult = false;
        boolean result = instance.conditions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculNombreMoyenClientDansLeSys method, of class FileAttente.
     */
    @Test
    public void testCalculNombreMoyenClientDansLeSys() {
        System.out.println("calculNombreMoyenClientDansLeSys");
        FileAttente instance = new FileAttenteImpl();
        instance.calculNombreMoyenClientDansLeSys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculNombreMoyenClientDansLaFile method, of class FileAttente.
     */
    @Test
    public void testCalculNombreMoyenClientDansLaFile() {
        System.out.println("calculNombreMoyenClientDansLaFile");
        FileAttente instance = new FileAttenteImpl();
        instance.calculNombreMoyenClientDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculDureeMoyenneAttenteDansLeSys method, of class FileAttente.
     */
    @Test
    public void testCalculDureeMoyenneAttenteDansLeSys() {
        System.out.println("calculDureeMoyenneAttenteDansLeSys");
        FileAttente instance = new FileAttenteImpl();
        instance.calculDureeMoyenneAttenteDansLeSys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculDureeMoyenneAttenteDansLaFile method, of class FileAttente.
     */
    @Test
    public void testCalculDureeMoyenneAttenteDansLaFile() {
        System.out.println("calculDureeMoyenneAttenteDansLaFile");
        FileAttente instance = new FileAttenteImpl();
        instance.calculDureeMoyenneAttenteDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculProbabiliteTemps method, of class FileAttente.
     */
    @Test
    public void testCalculProbabiliteTemps() {
        System.out.println("calculProbabiliteTemps");
        int iEtat = 0;
        FileAttente instance = new FileAttenteImpl();
        double expResult = 0.0;
        double result = instance.calculProbabiliteTemps(iEtat);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FileAttente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FileAttente instance = new FileAttenteImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FileAttenteImpl extends FileAttente {
    }

}
