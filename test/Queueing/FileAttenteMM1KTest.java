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
public class FileAttenteMM1KTest {

    public FileAttenteMM1KTest() {
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
     * Test of init method, of class FileAttenteMM1K.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        //test with no value
        FileAttenteMM1K instance = new FileAttenteMM1K();
        try {
            instance.init();
        } catch (ArithmeticException e) {
            fail("Erreur ArithmecticException");
        }
        //test with value
        instance = new FileAttenteMM1K(1, 2, 2, 1, 2);
        try {
            instance.init();
        } catch (ArithmeticException e) {
            fail("Erreur ArithmecticException");
        }
    }

    /**
     * Test of conditions method, of class FileAttenteMM1K.
     */
    @Test
    public void testConditions() {
        //test the conditions here it should always return true
        System.out.println("conditions");
        FileAttenteMM1K instance = new FileAttenteMM1K();
        boolean expResult = true;
        boolean result = instance.conditions();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculProbabiliteJ method, of class FileAttenteMM1K.
     */
    @Test
    public void testCalculProbabiliteJ() {
        //test the probability calcul without value
        System.out.println("calculProbabiliteJ");
        int dJ = 0;
        double test = 1. / 3.;
        FileAttenteMM1K instance = new FileAttenteMM1K();
        double expResult = 1.0;
        double result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, result, 0.0);

        //test the probability calcul with value, rho = 1 and 2 customers
        instance = new FileAttenteMM1K(1, 1, 2, 2, 2);
        instance.init();

        //it should be equal to 1 / (nb customer+1) so 0.333
        result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, Math.round(result * 100), Math.round(test * 100));

        //test the probability calcul with value, rho = 0.5 with 1 customer the result is 0.666
        instance = new FileAttenteMM1K(1, 2, 1, 2, 2);
        instance.init();

        result = instance.calculProbabiliteJ(dJ);
        assertEquals(expResult, Math.round(result * 100), Math.round(test * 2 * 100));
    }

    /**
     * Test of calculNombreMoyenClientDansLaFile method, of class
     * FileAttenteMM1K.
     */
    @Test
    public void testCalculNombreMoyenClientDansLaFile() {
        System.out.println("calculNombreMoyenClientDansLaFile");
        FileAttenteMM1K instance = new FileAttenteMM1K();
        instance.calculNombreMoyenClientDansLaFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculNombreMoyenClientDansLeSys method, of class
     * FileAttenteMM1K.
     */
    @Test
    public void testCalculNombreMoyenClientDansLeSys() {
        System.out.println("calculNombreMoyenClientDansLeSys");
        FileAttenteMM1K instance = new FileAttenteMM1K();
        instance.calculNombreMoyenClientDansLeSys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
