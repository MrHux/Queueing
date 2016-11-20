/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queueing;

/**
 *
 * @author hux
 */
public class FileAttenteMM1K extends FileAttente {

    /**
     *
     */
    public FileAttenteMM1K() {
        super();
    }

    /**
     *
     * @param dLambda
     * @param dMu
     * @param iNbClient
     * @param iNbServer
     */
    public FileAttenteMM1K(double dLambda, double dMu, int iNbClient, int iNbServer, double dT) {
        super(dLambda, dMu, iNbClient, iNbServer, dT);
    }

    @Override
    public void init() {
        calculdRho();
        if (conditions()) {
            //attention à l'ordre des calcules il est important
            calculNombreMoyenClientDansLeSys();
            calculNombreMoyenClientDansLaFile();
            calculDureeMoyenneAttenteDansLaFile();
            calculDureeMoyenneAttenteDansLeSys();
        } else {
            System.out.println("ERROR fonction init");
        }
    }

    @Override
    public boolean conditions() {
        return true; //il n'y a pas de condition pour cette file
    }

    @Override
    public double calculProbabiliteJ(int dJ) {
        if (dRho == 1) {
            return 1 / (1 + (double) iNbClient);
        } else {
            return (((1 - dRho) * Math.pow(dRho, dJ)) / (1 - Math.pow(dRho, iNbClient + 1)));
        }
    }

    @Override
    public void calculNombreMoyenClientDansLaFile() {
        setdLq(dL - (1 - calculProbabiliteJ(0)));
    }

    @Override
    public void calculNombreMoyenClientDansLeSys() {
        if (dRho == 1) {
            setdL(iNbClient / 2);
        } else {
            setdL((dRho * (1 - (iNbClient + 1) * Math.pow(dRho, iNbClient) + iNbClient * Math.pow(dRho, iNbClient + 1))) / ((1 - dRho) * (1 - Math.pow(dRho, iNbClient + 1))));
        }
    }

}
