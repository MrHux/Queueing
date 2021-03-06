/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queueing;

import MathsFunctions.*;

/**
 *
 * @author hux
 */
public class FileAttenteMMS extends FileAttente {

    /**
     *
     */
    public FileAttenteMMS() {
        super();
    }

    /**
     *
     * @param dLambda
     * @param dMu
     * @param iNbClient
     * @param iNbServer
     * @param dT
     */
    public FileAttenteMMS(double dLambda, double dMu, int iNbClient, int iNbServer, double dT) {
        super(dLambda, dMu, iNbClient, iNbServer, dT);
    }

    @Override
    public void init() throws ArithmeticException {

        calculdRho();
        if (conditions()) {
            //attention à l'ordre des calcules il est important
            calculNombreMoyenClientDansLaFile();
            calculDureeMoyenneAttenteDansLaFile();
            calculDureeMoyenneAttenteDansLeSys();
            calculNombreMoyenClientDansLeSys();
        } else {
            System.out.println("ERROR fonction init");
        }

    }

    @Override
    public void calculdRho() {
        setdRho(dLambda / (iNbServer * dMu));
    }

    @Override
    public boolean conditions() {
        return true;//condition sur rho ?
    }

    @Override
    public double calculProbabiliteJ(int dJ) {
        //si dJ == 0
        if (dJ == 0) {
            double sum = 0;
            for (int j = 0; j < iNbServer; j++) {
                sum += Math.pow((dRho * (double) iNbServer), j) / (double) Factorielle.Factoriel(j);
            }
            sum += Math.pow((dRho * iNbServer), iNbServer) / ((double) Factorielle.Factoriel(iNbServer) * (1 - dRho));
            return 1 / sum;
        } else {
            //si 0 < dJ < 5
            if (dJ > 0 && dJ < 5) {
                return (Math.pow((dRho * iNbServer), dJ) / (double) Factorielle.Factoriel(dJ)) * calculProbabiliteJ(0);
            } //si dJ >= 5
            else {
                return ((Math.pow(iNbServer, iNbServer) * Math.pow(dRho, dJ)) / ((double) Factorielle.Factoriel(iNbServer))) * calculProbabiliteJ(0);
            }
        }
    }

    @Override
    public void calculNombreMoyenClientDansLaFile() {
        setdLq((calculProbabiliteJ(0) * (Math.pow((dRho * iNbServer), iNbServer) * dRho)) / (Factorielle.Factoriel(iNbServer) * Math.pow((1 - dRho), 2)));
    }

    /**
     *
     * @param t
     * @return
     */
    public double calculDureeSejourDsLeSys(double t) {
        if (t > 0) {
            return Math.exp(-(dMu * t * (1 - dRho))) * calculDureeSejourDsLeSys(0);
        } else {
            return calculProbabiliteJ(0) * (Math.pow(Math.pow(dRho, iNbServer), iNbServer)) / (Factorielle.Factoriel(iNbServer) * (1 - dRho));
        }
    }

    @Override
    public double calculProbabiliteTemps(int iEtat) {

        double dFirstNumerator = calculProbabiliteJ(iEtat) * Math.pow(Math.exp(iNbServer), iNbServer);
        double dFirstDenominator = Factorielle.Factoriel(iNbServer) * (1 - dRho);

        double dSecondNumerator = 1 - Math.exp(-dMu * dT * (iNbServer - 1 - Math.pow(dRho, iNbServer)));
        double dSecondDenominator = iNbServer - 1 - Math.pow(dRho, iNbServer);

        double dFirstMember = Math.exp(-dMu * dT);

        double dSecondMember = 1 + (dFirstNumerator / dFirstDenominator) * (dSecondNumerator / dSecondDenominator);

        return dFirstMember * dSecondMember;

    }

}
