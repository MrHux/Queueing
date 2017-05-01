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
public class FileAttenteMM1Test {

    public FileAttenteMM1Test() {
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
     * Test of init method, of class FileAttenteMM1.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        //test with no value
        FileAttenteMM1 instance = new FileAttenteMM1();
        try {
            instance.init();
        } catch (ArithmeticException e) {
            fail("Erreur ArithmecticException");
        }
        //test with value
        instance = new FileAttenteMM1(1, 2, 2, 1, 2);
        try {
            instance.init();
        } catch (ArithmeticException e) {
            fail("Erreur ArithmecticException");
        }
    }

    /**
     * Test of conditions method, of class FileAttenteMM1.
     */
    @Test
    public void testConditions() {
        System.out.println("conditions");
        //in the case rho == 0
        FileAttenteMM1 instance = new FileAttenteMM1();
        instance.init();
        boolean expResult = true;
        boolean result = instance.conditions();
        assertEquals(expResult, result);

        //in the case rho == 1
        instance = new FileAttenteMM1(2, 2, 2, 1, 2);
        instance.init();
        result = instance.conditions();
        expResult = false;
        assertEquals(expResult, result);

        //in the case rho < 1
        instance = new FileAttenteMM1(1, 2, 2, 1, 2);
        instance.init();
        result = instance.conditions();
        expResult = true;
        assertEquals(expResult, result);
        //the case with rho >= 1 is not possible
    }

    /**
     * Test of calculNombreMoyenClientDansLeSys method, of class FileAttenteMM1.
     */
    @Test
    public void testCalculNombreMoyenClientDansLeSys() {
        System.out.println("calculNombreMoyenClientDansLeSys");
        FileAttenteMM1 instance = new FileAttenteMM1();
        instance.calculNombreMoyenClientDansLeSys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculNombreMoyenClientDansLaFile method, of class
     * FileAttenteMM1.
     */
    @Test
    public void testCalculNombreMoyenClientDansLaFile() {
        System.out.println("calculNombreMoyenClientDansLaFile");
        FileAttenteMM1 instance = new FileAttenteMM1();
        instance.calculNombreMoyenClientDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculDureeMoyenneAttenteDansLeSys method, of class
     * FileAttenteMM1.
     */
    @Test
    public void testCalculDureeMoyenneAttenteDansLeSys() {
        System.out.println("calculDureeMoyenneAttenteDansLeSys");
        FileAttenteMM1 instance = new FileAttenteMM1();
        instance.calculDureeMoyenneAttenteDansLeSys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculDureeMoyenneAttenteDansLaFile method, of class
     * FileAttenteMM1.
     */
    @Test
    public void testCalculDureeMoyenneAttenteDansLaFile() {
        System.out.println("calculDureeMoyenneAttenteDansLaFile");
        FileAttenteMM1 instance = new FileAttenteMM1();
        instance.calculDureeMoyenneAttenteDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculProbabiliteJ method, of class FileAttenteMM1.
     */
    @Test
    public void testCalculProbabiliteJ() {
        System.out.println("calculProbabiliteJ");
        int dJ = 0;
        FileAttenteMM1 instance = new FileAttenteMM1();
        double expResult = 0.0;
        double result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
