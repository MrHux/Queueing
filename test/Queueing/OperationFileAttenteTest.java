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
public class OperationFileAttenteTest {

    public OperationFileAttenteTest() {
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
     * Test of calcul method, of class OperationFileAttente.
     */
    @Test
    public void testCalcul() {
        System.out.println("calcul");
        int iNbServer = 0;
        int iNbClient = 0;
        double dMu = 0.0;
        double dLambda = 0.0;
        String sTypeFile = "";
        int iEtat = 0;
        double dT = 0.0;
        String expResult = "";
        String result = OperationFileAttente.calcul(iNbServer, iNbClient, dMu, dLambda, sTypeFile, iEtat, dT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
